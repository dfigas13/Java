const randomNumbers = [27, 64, 47, 78, 48, 11, 76, 25, 11, 83];

let res = 0;

function maxFromArray(exeArr) {
	for (let i = 0; i < exeArr.length; i++) {
		if (!Number.isInteger(exeArr[i])) {
			continue;
		} else if (exeArr[i] > res) {
			res = exeArr[i];
		}
	}
	return res;
}
console.log(maxFromArray(randomNumbers));

