/**
 * 
 */

//비동기 방식

let val = 10;


setTimeout(function() {
	val += 5;
	console.log('hello', val);

	setTimeout(function() {
		val += 3;
		console.log('hello2', val);
	}, 1000);
}, 2000);

let success = true;
let promise = new Promise(function(resolve, reject) {
	if (success) {
		resolve('success');
	} else {
		reject('error');
	}
});

promise
	.then(function(result){
		console.log(result);
	})
	.then(function(result){
		console.log(result)
	})
	.then(function(){
		console.log(3)
	})
	.catch(function(err){
		console.log(err);
	});

