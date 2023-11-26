let count = 0;
const selection1 = document.querySelector('.selection_count');
const selection2 = document.querySelector('.selection_count--buttons');
const arrCheckBox = document.getElementsByClassName('chekbox');

function eventFilter() {
	const filter = document.querySelector('.filter');
	const namePage = document.querySelector('.name_page')
	if(filter.classList.contains('display_none')) {
		namePage.classList.add('display_none')
		filter.classList.remove('display_none');
	} else {
		filter.classList.add('display_none')
		namePage.classList.remove('display_none')
	}

}

function openElement(event) {

	switch(event.value) {
		case 'on':
			if (event.checked) {
				count += 1;
			} else {
				count -= 1
			}
			closeOpenElement()
			break;
		
		case 'clear':
			count = 0;

			for(let i = 0; i < arrCheckBox.length; i++) {
				arrCheckBox[i].checked = false;
			}

			closeOpenElement()

			break;
		case 'all':
			if (event.checked) {
				count = arrCheckBox.length;
				for(let i = 0; i < arrCheckBox.length; i++) {
					arrCheckBox[i].checked = true;
				}
			} else {
				count = 0;
				for(let i = 0; i < arrCheckBox.length; i++) {
					arrCheckBox[i].checked = false;
				}
			}

			closeOpenElement()
			break;
	}
		
}

function closeOpenElement() {
	let countCheckt = document.querySelector('.countCheckt');
	let checkBox = document.querySelector('.all');
	if(count <= 0 && !selection1.classList.contains('display_none') && !selection2.classList.contains('display_none')) {
		checkBox.checked = false
		selection1.classList.add('display_none');
		selection2.classList.add('display_none');
	} else if(count > 0 && selection1.classList.contains('display_none') && selection2.classList.contains('display_none')) {
		selection1.classList.remove('display_none');
		selection2.classList.remove('display_none');
	}
	if (count > arrCheckBox.length - 1) {
		checkBox.checked = true
	} else {
		checkBox.checked = false
	}

	countCheckt.innerHTML = `${count}`
}

function changePage(event) {
	const numberPage = document.querySelector('.number_page');
	let number = Number(numberPage.value);
	console.log(numberPage)
	
	if (event.classList.contains('down') && number > 1) {
		number -= 1;
	} else if (event.classList.contains('up')) {
		number += 1;
	}
	numberPage.setAttribute('value', `${number}`)
}

function eventSelect(event) {
	event.classList.add(event.value);
}


