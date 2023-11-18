const help = document.querySelector('.linc--help');
const closes = document.querySelector('.help--massage--close');

function openHelp() {
	const helpDiv = document.querySelector('.help');
	helpDiv.removeAttribute('hidden')
	console.log(form.submit)
}

function closeHelp(event) {
	event.preventDefault();
	const helpDiv = document.querySelector('.help');
	helpDiv.setAttribute("hidden", "");
}

function check() {
	var inp1 = document.querySelector('.input_email'),
		inp2 = document.querySelector('.input_password')
		let isValid = inp1.value.toLowerCase().match(/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|.(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/) ? true : false;
		if (inp2.value.length >= 6 && isValid) {
		document.querySelector('.container_input_button').disabled = inp1.value && inp2.value ? false : "disabled";
	}
}
	

help.addEventListener("click", openHelp);
closes.addEventListener("click", closeHelp);
