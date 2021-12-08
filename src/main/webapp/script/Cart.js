function IDgen() {
  return new Date().getTime();
}

// eslint-disable-next-line
function addToCard(Name, Price, Desc, Img) {
  const orders = JSON.parse(localStorage.getItem("order") ?? "[]");

  const order = { id: IDgen(), Name: Name, Price: Price, Desc: Desc, Img: Img };

  orders.push(order);

  localStorage.setItem("order", JSON.stringify(orders));
  localStorage.getItem("order");
}

// eslint-disable-next-line
function removeLocalStorage() {
  localStorage.clear();
}
