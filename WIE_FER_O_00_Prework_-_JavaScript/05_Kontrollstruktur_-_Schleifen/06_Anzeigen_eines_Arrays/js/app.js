const array = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
];

// Write code under this comment.
for (let i = 0; i < array.length; i++) {
	for (let j = 0; j < array[i].length; j++) {
		console.log(array[i][j]);
	}
}
console.log();
// Zusatz
const array2D2 = [['Marta', 'Klaus', 'Fiona', 'Karin'], [1, 5, 8, 13, 2]];

for (let i = 0; i < array2D2.length; i++) {
	for (let j = 0; j < array2D2[i].length; j++) {
		console.log(array2D2[i][j]);
	}
}