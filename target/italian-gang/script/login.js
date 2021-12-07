const outAction = document.querySelectorAll(".out-box-modal");
const modalForm = document.querySelector("#modal");
const loginForm = document.querySelector(".authen-form.-login-authen-form");
const registerForm = document.querySelector(
  ".authen-form.-register-authen-form"
);
const loginButton = document.getElementById("btnLogin");
const logoutButton = document.getElementById("btnLogout");

const registerButton = document.querySelector(
  ".authen-form.-login-authen-form .button--register"
);

const logButton = document.querySelector(
  ".authen-form.-register-authen-form .button--login"
);

const returnButton = document.querySelectorAll(
  ".authen-form__footer .out-box-modal"
);

if (loginButton !== null) {
  loginButton.addEventListener("click", () => {
    removeLocalStorage();
    modalForm.style.display = "flex";
    loginForm.style.display = "block";
    registerForm.style.display = "none";
  });
}

if (logoutButton !== null) {
  logoutButton.addEventListener("click", () => {
    removeLocalStorage();
    window.location.href = "/logout";
  });
}

if (registerButton !== null) {
  registerButton.addEventListener("click", () => {
    modalForm.style.display = "flex";
    loginForm.style.display = "none";
    registerForm.style.display = "block";
  });
}

if (logButton !== null) {
  logButton.addEventListener("click", () => {
    modalForm.style.display = "flex";
    loginForm.style.display = "block";
    registerForm.style.display = "none";
  });
}

if (returnButton !== null) {
  returnButton.forEach((item) => {
    item.addEventListener("click", () => {
      modalForm.style.display = "none";
      loginForm.style.display = "none";
      registerForm.style.display = "none";
    });
  });
}
