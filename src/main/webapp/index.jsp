<html>
  <head>
    <title>ItalianGang</title>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="style/style.css" />
    <script src="script/login.js" defer></script>
    <script src="script/Cart.js" defer></script>
  </head>
  <body>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<%@ page isELIgnored="false" %>
    <%@ include file = "./header.jsp"%>
    <main class="content">
      <div class="banner">
        <h1 class="banner--content">ITALIAN-GANG</h1>
        <h2 class="banner--content banner--content__h2">
          <span>Pizza for Gangsters</span>
          <span>eating 'til die</span>
        </h2>
      </div>
      <div class="wraper">
        <div id="_menu"></div>
        <h1 id="menu">Menu</h1>
			<c:forEach var="pizza" items="${listPizzas}">
				<div class="pizza">
					<img src="${pizza.getImg()}" alt="${pizza.getName()}"/>
					<div class="pizza__text">
						<div class="pizza__text__header">
							<h1>${pizza.getName()}</h1>
							<div class="pizza__text__header__seperator"></div>
							<h1>${pizza.getPrice()}</h1><span>$<span>
						</div>
						<p>
							${pizza.getDescription()}
						</p>
						<button
						  class="pizza__text__button"
						  onclick="addToCard(`${pizza.getName()}`, ${pizza.getPrice()}, `${pizza.getDescription()}`, `${pizza.getImg()}`)"
						>
						  Add to order
						</button>
					</div>
				</div>
			</c:forEach>
		</div>
    </main>
    <%@ include file = "./footer.jsp"%>
	<c:if test="${sessionScope.user != null}">
		<a class="cart" href="cart.jsp">
		  <img
			src="https://upload.wikimedia.org/wikipedia/commons/b/bc/Font_Awesome_5_solid_shopping-cart.svg"
		  />
		</a>
	</c:if>
    <%@ include file = "./login.jsp"%>
  </body>
</html>
