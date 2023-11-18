function openHelp() {
	const helpDiv = document.querySelector('.help');
	helpDiv.removeAttribute('hidden')
}

function closeHelp(event) {
	event.preventDefault();
	const helpDiv = document.querySelector('.help');
	helpDiv.setAttribute("hidden", "");
}