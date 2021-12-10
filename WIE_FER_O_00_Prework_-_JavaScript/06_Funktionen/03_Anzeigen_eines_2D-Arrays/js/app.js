const usersList = [['John', 'Newman'], ['Zander', 'Branson']];

function printArray2D(array2D) {
	for (let i = 0; i < array2D.length; i++) {
		for (let j = 0; j < array2D[i].length; j++) {
			console.log(array2D[i][j]);
			// return array2D[i][j];
		}
	}
}
printArray2D(usersList);

