let orders = JSON.parse(localStorage.getItem("order") ?? "[]");
const bill = document.getElementById("itemCount");
const price = document.getElementById("TotalPrice");
const a = document.getElementById("contain");

orders.forEach((element) => {
  a.appendChild(CreateCard(element));
});

function updatePrice() {
  bill.innerText = `${orders.length} pizza${orders.length > 1 ? "s" : ""}`;

  price.innerText = `${orders.reduce(
    (previousValue, currentValue) => previousValue + currentValue.Price,
    0
  )}`;
}

updatePrice();

function CreateCard(element) {
  const MainCard = document.createElement("div");
  MainCard.classList.add("itemContainer", "double_border");
  const span1 = document.createElement("span");
  const img = document.createElement("img");
  img.src = element.Img;
  span1.appendChild(img);
  const info = document.createElement("span");
  info.classList.add("info");
  const NameDiv = document.createElement("div");
  NameDiv.id = "name";
  NameDiv.innerText = element.Name;
  const priceDiv = document.createElement("div");
  priceDiv.id = "price";
  priceDiv.innerText = `${element.Price} $`;
  const button = document.createElement("button");
  button.classList.add("remove");
  info.appendChild(NameDiv);
  const descdiv = document.createElement("div");
  descdiv.innerText = element.Desc;
  info.appendChild(descdiv);
  info.appendChild(priceDiv);
  button.innerHTML = `<svg xmlns="http://www.w3.org/2000/svg" width="15" height="15" viewBox="0 0 24 24"><path d="M24 20.188l-8.315-8.209 8.2-8.282-3.697-3.697-8.212 8.318-8.31-8.203-3.666 3.666 8.321 8.24-8.206 8.313 3.666 3.666 8.237-8.318 8.285 8.203z"/></svg>`;

  button.addEventListener("click", () => {
    a.removeChild(MainCard);

    localStorage.setItem(
      "order",
      JSON.stringify(orders.filter((e) => e.id !== element.id))
    );

    orders = JSON.parse(localStorage.getItem("order"));
    updatePrice();
  });

  MainCard.appendChild(span1);
  MainCard.appendChild(info);
  MainCard.appendChild(button);

  return MainCard;
}
