var radio = prompt("Ingrese el radio de la circunferencia", 5);
const PI = 3.141592;
var area = PI * radio ** 2;
var perimetro = 2 * PI * radio;
// alert("El área de la circunferencia es " + area);
// alert("El perímetro de la circunferencia es " + perimetro);
console.log("El área de la circunferencia es " + area);
console.log("El perímetro de la circunferencia es " + perimetro);
var output = "<h1>El área de la circunferencia es " + area + "</h1><br>";
var output2 = "<h1>El perímetro de la circunferencia es " + perimetro + "</h1>"



document.write(output);
document.write(output2);