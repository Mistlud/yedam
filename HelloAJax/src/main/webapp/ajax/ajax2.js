/**
 * 
 */

let val = 6;
let promise = new Promise((ress, reject) => {
	val -= 1;
	if (val > 0) {
		ress('success' + val);
	} else {
		reject('err');
	}
});

promise.then(resolve => {
	return new promise((result, reject) => {
		val -= 2;
		if (val > 0) {
			result('success' + val);
		} else {
			reject('err')
		}
	})
		.then()
		.catch()
});
