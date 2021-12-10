const car = {
	type: 'sedan',
	color: 'green',
	engine: '2.0'
}
console.log(car.type + " " + car.color + " " + car.engine);

// Farbe 
const pixelColors = {
	red: 100,
	green: 0,
	blue: 50
}

const referanceColor = pixelColors;
referanceColor.red = 50;
referanceColor.green = 50;

/* 
console.log(pixelColors.red);
console.log(pixelColors.green); */