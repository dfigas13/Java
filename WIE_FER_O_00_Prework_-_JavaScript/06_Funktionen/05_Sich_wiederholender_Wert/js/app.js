const arr = [4, 21, 4, 55, 87, 40, 55, 32, 90, 2];
let index;

function indexOfRepeatedValue(array) {
	for(let i = 0; i < array.length; i++) {
		let indexI = array[i];
		if (array.indexOf(indexI) !== array.lastIndexOf(indexI)) {
			index = i;
			console.log('INDEX: ' + index + ' ZAHL: ' + arr[index]);
			break;
		}
	}
}
indexOfRepeatedValue(arr);