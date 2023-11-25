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

function focusInput(elem) {
	let splits = elem.className.split('_');
	let svg = document.querySelector(`.svg_${splits[1]}`)
	svg.setAttribute("fill", "#2255EA")
	elem.style.cssText += `
				color: #000000;
				border-color: #2255EA;
		  	`;
	const paragraphInvalid = document.querySelector(`.invalid_Value_${splits[1]}`)
	console.log(paragraphInvalid)
	paragraphInvalid.setAttribute('hidden', '')
	
	
}

function focusoutInput(elem) {
	let classElem = elem.className.split('_')[1];
	let elemValue = elem.value

	function isInvalideValue() {
		let svg = document.querySelector(`.svg_${classElem}`)
			svg.setAttribute("fill", "#FB1F47");
			elem.style.cssText += `
				color: #FB1F47;
				border-color: #FB1F47;
		  	`;
			const paragraphInvalid = document.querySelector(`.invalid_Value_${classElem}`)
			paragraphInvalid.removeAttribute('hidden')
	}

	function isValideValue() {
		let svg = document.querySelector(`.svg_${classElem}`)
			svg.setAttribute("fill", "#2255EA");
			elem.style.cssText += `
				color: #000000;
				border-color: #2255EA;
		  	`;
			const paragraphInvalid = document.querySelector(`.invalid_Value_${classElem}`)
			paragraphInvalid.setAttribute('hidden', '')
	}
	if(classElem === 'email') {
		let isValideEmail = elemValue.toLowerCase().match(/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|.(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/) ? true : false;
		if(!isValideEmail) {
			isInvalideValue();
		} else {
			isValideValue()
		}
	
	} else {
		let isValidePassword = elemValue.toLowerCase().match(/^[a-zA-Z0-9]+$/) ? true : false;
		console.log(isValidePassword)
		if(!isValidePassword) {
			isInvalideValue();
		}
	}
}

function showPassword() {
	const btn = document.querySelector('.password_btn')
	const input = document.querySelector('.input_password')

	btn.addEventListener('click', () => {
		if(input.getAttribute('type') === 'password') {
			input.setAttribute('type', 'text')
			btn.childNodes[0].setAttribute('src', '../images/eye.png')
		} else {
			input.setAttribute('type', 'password')
			btn.childNodes[0].setAttribute('src', '../images/EyeClosed.png')
		}
	})
}

showPassword()

help.addEventListener("click", openHelp);
closes.addEventListener("click", closeHelp);
