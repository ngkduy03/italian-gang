function initPayPalButton() {
  const amount = document.getElementById("TotalPrice").innerText;

  paypal
    .Buttons({
      // Sets up the transaction when a payment button is clicked
      createOrder: function (_, actions) {
        return actions.order.create({
          purchase_units: [
            {
              amount: {
                currency_code: "USD",
                value: amount,
              },
            },
          ],
        });
      },
      onCancel: function () {
        window.location.href = "../cart.jsp";
      },
      // Finalize the transaction after payer approval
      onApprove: function (_, actions) {
        return actions.order.capture().then(function () {
          const layout = document.getElementById("layout");

          layout.style.display = "flex";

          setTimeout(() => {
            layout.style.display = "none";
          }, 2000);

          removeLocalStorage();

          setTimeout(() => {
            window.location.href = "/";
          }, 4000);
        });
      },
    })
    .render("#paypal-button-container");
}

window.addEventListener("DOMContentLoaded", initPayPalButton);
