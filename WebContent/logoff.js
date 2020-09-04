function logoff() {
    sessionStorage.setItem("logged", false);
    sessionStorage.setItem("uemail", null);
    sessionStorage.setItem("uname", null);
    location.href = "loggedoff.html";
}
