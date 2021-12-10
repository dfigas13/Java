const array = [[], []];
const cols = 4;
const rows = 5;
// Write code under this comment.

for (let i = 1; i <= rows; i++) {
	for (let j = 1; j <= cols; j++) {
		array[0].push(i);
		array[1].push(j);
	}
}
console.log(array);