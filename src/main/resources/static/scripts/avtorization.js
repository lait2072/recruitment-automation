const help = document.querySelector('.linc--help');
const closes = document.querySelector('.help--massage--close');

function openHelp() {
	const helpDiv = document.querySelector('.help');
	helpDiv.removeAttribute('hidden')
	console.log(form.submit)
}

function myFunction() {
    let inpObj = document.getElementById("id1");
    if (!inpObj.checkValidity()) {
        document.getElementById("demo").innerHTML = inpObj.validationMessage;
    }
}


function closeHelp(event) {
	event.preventDefault();
	const helpDiv = document.querySelector('.help');
	helpDiv.setAttribute("hidden", "");
}

function check() {
	var inp1 = document.querySelector('.input_email'),
		inp2 = document.querySelector('.input_password')
	if (inp2.value.length >= 6) {
		document.querySelector('.container_input_button').disabled = inp1.value && inp2.value ? false : "disabled";
	}
	
}
	

help.addEventListener("click", openHelp);
closes.addEventListener("click", closeHelp);
