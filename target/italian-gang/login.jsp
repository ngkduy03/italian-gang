<div id="modal">
  <div id="modal__layout" class="out-box-modal"></div>
  <div id="modal__body">
	<!-- Register form -->
	<form action="register" method ="post" class="authen-form -register-authen-form">
	  <div class="authen-form__container">
		<div class="authen-form__header">
		  <h3 class="header-caption">Register</h3>
		  <span class="seperate"></span>
		  <button
			type="button"
			name="button"
			class="button--login -background-white -align-right"
		  >
			Login
		  </button>
		</div>
		<div class="authen-form__body">
		  <div class="text-field">
			<input
			  type="text"
			  class="body-input"
			  name="account"
			  value="account"
			  required
			/>
			<label>Enter your account</label>
			<span></span>
		  </div>
		  <div class="text-field">
			<input
			  type="password"
			  class="body-input"
			  name="password"
			  value="password"
			  minlength="8"
			  maxlength="12"
			  required
			/>
			<label>Enter your password</label>
			<span></span>
		  </div>
		  <div class="text-field">
			<input
			  type="password"
			  class="body-input"
			  name="re-password"
			  value="re-password"
			  required
			/>
			<label>Enter your password again</label>
			<span></span>
		  </div>
		</div>
		<div class="authen-form__footer">
		  <button type="button" class="button out-box-modal">Return</button>
		  <button type="submit" class="button--register">Register</button>
		</div>
	  </div>
	</form>
	<!-- Login form -->
	<form action="/login" method="post" class="authen-form -login-authen-form">
	  <div class="authen-form__container">
		<div class="authen-form__header">
		  <h3 class="header-caption">Login</h3>
		  <span class="seperate"></span>
		  <button
			type="button"
			name="button"
			class="button--register -background-white -align-right"
		  >
			Register
		  </button>
		</div>
		<div class="authen-form__body">
		  <div class="text-field">
			<input
			  type="text"
			  class="body-input"
			  name="account"
			  value="account"
			  required
			/>
			<label>Account</label>
			<span></span>
		  </div>
		  <div class="text-field">
			<input
			  type="password"
			  class="body-input"
			  name="password"
			  value="password"
			  required
			/>
			<label>Password</label>
			<span></span>
		  </div>
		  <div class="body-support">
			<a href="" class="body-support__link">Forgot your password</a>
			<span class="seperate"></span>
			<a href="" class="body-support__link">Support?</a>
		  </div>
		</div>
		<div class="authen-form__footer">
		  <button type="button" class="button out-box-modal">Return</button>
		  <button type="submit" class="button--login">Login</button>
		</div>
	  </div>
	</form>
  </div>
</div>
