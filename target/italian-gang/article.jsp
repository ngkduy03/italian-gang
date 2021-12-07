<html>
  <head>
    <title>ItalianGang</title>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="/style/style.css" />
    <link rel="stylesheet" href="/style/shoppingCart.css" />
    <link rel="stylesheet" href="/style/article.css" />
    <script src="./script/Cart.js" defer></script>
	<script src="./script/login.js" defer></script>
  </head>
  <body>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <img class="bg" src="./img/table.jpg" alt="table" />
    <%@ include file = "./header.jsp"%>
    <main class="content">
      <div class="banner image">
        <h1 class="banner--content">ITALIAN-GANG</h1>
        <h2 class="banner--content banner--content__h2">
          <span>Pizza for Gangsters</span>
          <span>eating 'til die</span>
        </h2>
      </div>
      <div class="letterC">
        <div class="letter">
          Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum
          dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem
          ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor
          Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum
          dolor
          <div class="bletter">
            <p class="para">Dear Mrs Tho</p>
            <p>
              We are from group 8 with two members are Do Ngoc Anh Vien and
              Nguyen Khang Duy. It's our honor to present you this website for
              our final project. This is an ecommerce website about selling
              pizzas online. In spite of tough time that covid 19 bring to our
              life, we have manage and try our best to satisfy your expectation.
              We hope you can enjoy our efforts and give us high mark for this
              subject.
            </p>
            <p>For all the best wishes to you and your family!</p>
            <p>
              Nguyen Khang Duy <br />
              Do Ngoc Anh Vien.
            </p>
          </div>
        </div>
      </div>
    </main>
    <%@ include file = "./login.jsp"%>
  </body>
</html>
