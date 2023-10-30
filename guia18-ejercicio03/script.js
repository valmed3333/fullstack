var edad = parseInt(prompt("Introduzca su edad"));
// alert(edad);
if (!isNaN(edad)) {
    if (edad >= 18) {
        alert("Ud es mayor de edad");
    } else {
        alert("Ud es menor de edad");
    };
} else {
    alert("No ha introducido un numero");
};
