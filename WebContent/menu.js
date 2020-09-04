
function moveto() {
	var val = document.getElementById("menu").value;
	if(val == 1){
		location.href = "myprofilepage.html";
	}
	else if(val == 2){
		location.href = "medicalhistory.html";
	}
	else if(val == 3){
		location.href = "forgotpassword.html";
	}
	else{
		location.href = "welcomepage.html";
	}
}
