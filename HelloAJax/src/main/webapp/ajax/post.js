/**
 * post.js
 */

document.addEventListener('DOMContentLoaded', init);

function init() { // 서버에서 전체조회
	let xhtp = new XMLHttpRequest();
	xhtp.open('get', '../studentList.json')
	xhtp.send();
	xhtp.onload = function() {
		let data = JSON.parse(xhtp.responseText);
		console.log(data);
		let tbodyList = document.getElementById('list');
		data.forEach(element => {
			tbodyList.appendChild(makeTr(element));
		});
	}
	let modBtn = document.querySelector('input[type="button"]');
	modBtn.addEventListener('click', function() {
		let no = document.querySelector('input[name="sno"]').value;
		let name = document.querySelector('input[name="sname"]').value;
		let eScore = document.querySelector('input[name="eScore"]').value;
		let kScore = document.querySelector('input[name="kScore"]').value;

		let xhtp = new XMLHttpRequest();
		xhtp.open('get', `modStudentServlet?a=${no}&b=${name}&c=${eScore}&d=${kScore}`);
		xhtp.send();
		xhtp.onload = function() {
			let result = JSON.parse(xhtp.responseText);
			if (result.retCode == 'ok') { //ret res
				let obj = {
					studentNo: result.studNo,
					studentName: result.studName,
					engScore: result.engScore,
					korScore: result.korScore
				}
				let newTr = makeTr(obj);
				let oldTr = document.getElementById(result.studNo);
				console.log(oldTr)
				console.log(newTr)
				document.getElementById('list').replaceChild(newTr, oldTr);
			} else {
				alert('변경 중 오류')
			}
		} //onload end

	})
}

function modStudent() {

}




function addStudent(e) {  //1건추가
	e.preventDefault();
	console.log('Answer1')

	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;

	let xhtp = new XMLHttpRequest();
	xhtp.open('get', `addStudentServlet?sno=${no}&sname=${name}&eScore=${eng}&kScore=${kor}`);
	xhtp.send();
	xhtp.onload = function() {
		console.log(xhtp.responseText);
		let result = JSON.parse(xhtp.responseText);
		if (result.retCode == 'Success') {
			//successCallBack();
			successCallBack2(result);
		} else if (result.retCode == 'Fail') {
			failCallBack();
		}
	}
}

function makeTr(student) {
	let tr = document.createElement('tr');
	tr.setAttribute('id', student.studentNo);
	for (let field in student) {
		let td = document.createElement('td');
		td.innerHTML = student[field];
		tr.appendChild(td);
	}
	let delbtn = document.createElement('button');
	delbtn.innerHTML = '삭제';

	delbtn.addEventListener('click', function() {
		let id = this.parentElement.parentElement.firstChild.innerHTML;
		let xhtp = new XMLHttpRequest();
		xhtp.open('get', 'delStudentServlet?delId=' + id);
		xhtp.send();
		xhtp.onload = function() {
			let result = JSON.parse(xhtp.responseText);
			if (result.resCode == 'ok') {
				console.log('o');
				let ox = document.getElementById(result.retVal);
				alert(result.retVal + '성공');
				ox.remove();
			} else if (result.resCode == 'ng') {
				console.log('x');
				alert(result.retVal + '실패');
			}
		}
	})
	let td = document.createElement('td');
	td.appendChild(delbtn);
	tr.appendChild(td);
	return tr;
}

function successCallBack2(retObj) {
	let obj = {
		studNo: retObj.studNo,
		studName: retObj.studName,
		engScore: retObj.engScore,
		korScore: retObj.korScore
	}
	document.getElementById('list').appendChild(makeTr(obj));


}

function successCallBack() {
	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;

	let obj = {
		sno: no,
		sname: name,
		engScore: eng,
		korScore: kor
	};
	let row = makeTr(obj);
	document.getElementById('list').appendChild(row);

}

function failCallBack() {
	alert('에러 발생');

}