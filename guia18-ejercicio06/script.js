function myFunction() {
    var check = document.getElementById("check");
    var numero = parseFloat(document.getElementById("numero").value);
    // alert("El numero escrito es " + numero + " y su tipo de variable es " + typeof numero)
    if (numero == 0) {
        check.innerHTML = ('El número no es par ni impar');
        check.setAttribute("style", "color:grey;");


    } else if (numero % 2 == 0) {
        check.innerHTML = ('El número es par');
        check.setAttribute("style", "color:chartreuse;");
    } else if (isNaN(numero)) {
        check.innerHTML = ('');
    } else {
        check.innerHTML = ('El número es impar');
        check.setAttribute("style", "color:red;");
    };
}