const n = 3;
const calc = [];
// Write code under this comment.
for (let i = 1; i <= n; i++) {
	console.log();
	for (let j = 1; j <= n; j++) {
		console.log(i + ' x ' + j + ' = ' + i * j);
		calc.push(j * i);
	}
}

console.log(calc);