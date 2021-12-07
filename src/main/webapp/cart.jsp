<html>
  <head>
    <title>ItalianGang</title>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="/style/style.css" />
    <link rel="stylesheet" href="/style/shoppingCart.css" />
    <link rel="stylesheet" href="/style/thanks.css" />
    <script src="/script/Cart.js" defer></script>
    <script src="/script/cart1.js" defer></script>
	<script src="/script/paypal.js" defer></script>
	<script src="https://www.paypal.com/sdk/js?client-id=Ac168FfjHNa-SERjcKvfUyowKz5w5_6q5yc9w7CEU-7PnbgqXalljT3oXhE1dulK63sHHoC90ZXC7As8"></script>
	</head>
	<body>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ include file = "./header.jsp"%>
    <main class="content">
		<div class="padding" id="top"></div>
		<div class="cartContent">
			<div class="card" id="contain"></div>
			<div class="bill double_border">
			<div class="title">RECEIPT</div>
			<div class="text">
				<div class="static">Total Items</div>
				<div id="itemCount">1</div>
			</div>
				<div class="text">
					<div class="static">Total Price</div>
						<div class="total-price-container">
						<div id="TotalPrice">1</div>&nbsp;<span>$</span>
					</div>
				</div>
				<div class="seperater"></div>
				<div id="paypal-button-container" class="btn"></div>
				<a id="continue" class="btn cbtn" href="/#_menu">Resume Ordering</a>
			</div>
		</div>
		<%@ include file = "./footer.jsp"%>
    </main>
	<div id="layout">
		<div class="popup">
			<div class="tick-mark"></div>
			<div class="thank-text">Payment Successfully!</div>
		</div>
	</div>
	<%@ include file = "./login.jsp"%>
	</body>
</html>

<!-- header height 72px -->
