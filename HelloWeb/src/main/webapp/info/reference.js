//레퍼런스

const names = ['Firis', 'Riane', 'Ir', 'Oscar'];

for (let i = 0; i < names.length; i++) {
  console.log(i + 1 + '번째 이름 : ' + names[i]);
}
for (const name of names) {
  console.log(name);
}

const numbers = [23, 44, 38, 12, 56];
for (const num of numbers) {
  if (num > 40) {
    console.log(num);
  }
}

// 합계, 평균 구하기
const inputs = [];
var sum = 0;
var avg = 0;
for (let i = 0; i < numbers.length; i++) {
  var inputVal = prompt('값을 입력하세요...');
  console.log(inputVal);
  sum += parseInt(inputVal);
  avg = sum / 5;
}
console.log('합계 = ' + sum);
console.log('평균 = ' + avg);

