const n = 13;
// Write code under this comment.

let count = 1;
while (count <= n) {
	if (count % 2 == 0) {
		console.log('Gerade Zahl: ' + count);
	} else {
		console.log('Ungerade Zahl: ' + count);
	}
	count++;
}

