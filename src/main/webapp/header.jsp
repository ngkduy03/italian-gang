<nav id="header">
  <ul class="container">
	<li id="icon" class="container--item">
	  <a href="/">
		<img
		  class="container--icon"
		  src="https://wowthemesnet.github.io/template-fooddelivery-bootstrap-html/img/logo.png"
		  alt="logo"
		/>
	  </a>
	</li>
	<c:choose>
		<c:when test="${sessionScope.user == null}">
			<li id="btnLogin" class="container--item">Login</li>
		</c:when>
		<c:otherwise>
			<li id="btnLogout" class="container--item">Logout</li>
		</c:otherwise>
	</c:choose>
	<li class="container--item"><a href="/article.jsp">Article</a></li>
	<li class="container--item">
		<a href="/#_menu">Menu</a>
	</li>
  </ul>
</nav>
