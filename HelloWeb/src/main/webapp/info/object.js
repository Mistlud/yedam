// 오브젝트 타입

let member1 = {
  fullName: 'Hong',
  age: 20,
  score: 80
}
let member2 = {
  fullName: 'Hwang',
  age: 22,
  score: 88
}
let member3 = {
  fullName: 'Park',
  age: 25,
  score: 92
}

member1.fullName = '홍'
console.log(member1.fullName, member2.age)
console.log(member1.age + member2.age + member3.age);

const members = [member1, member2, member3];
document.write('<ul>');
for (let i = 0; i < members.length; i++) {
  // document.write('<li>' +
  // members[i].fullName + '의 나이는 ' + members[i].age + '세, 점수는 ' + members[i].score + '점 입니다.'
  // +'</li>')
  document.write(
    `<li>${members[i].fullName}의 나이는 ${members[i].age}세, 점수는 ${members[i].score}점 입니다.</li>`
  )
}
document.write('</ul>')

