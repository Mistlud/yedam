//Page.js

console.log(member1);

for (let member of members) {
  console.log(`이름은 ${member['fullName']}, 나이는 ${member['age']}세, 점수는 ${member['score']}점 입니다.`)
}

for (let field in member1) {
  console.log(`${field} => ${member1[field]}`);
}

for (let member of members) {
  for (let field in member) {
    console.log(`${field} => ${member[field]}`);
  }
  console.log(`-------------------------`)
}
document.write('<table>')
let fields = ['fullName', 'score', 'age'];
for(let member of members){
  document.write('<tr>')
  for(let prop of fields){
    console.log(`${prop} => ${member[prop]}`);
    document.write(`<td>${member[prop]}</td>`)
  }
  document.write('<td><button>클릭</button></td>')
  document.write('</tr>')
  console.log(`----------------------`)
}
document.write('</table>')