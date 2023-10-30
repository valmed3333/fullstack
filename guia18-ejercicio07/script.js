function comenzarF() {
    var limite = document.getElementById("limite1").disabled = true;
    // limite.setAttribute('readonly','')
}

function agregarF() {
    var limite = parseInt(document.getElementById("limite1").value);
    var nuevoO = document.getElementById("limite2");
    var nuevo = parseInt(nuevoO.value);
    var resultado = document.getElementById("respuesta");
    var alcanzado = document.getElementById("alcanzado");
    var suma = parseInt(resultado.value);


    // alert("limite " + limite + "nuevo " + nuevo + "resultado " + resultado);
    // console.log(resultado);
    if (isNaN(suma)) {
        suma = 0;
    }

    suma = nuevo + suma;

    if (limite >= suma) {

        resultado.value = suma;
        nuevoO.value = "";
    } else {
        alert("La suma de " + (suma - nuevo) + " + " + nuevo + " es mayor que " + limite);
    };

    if (limite == resultado.value) {
        alcanzado.innerHTML = "Limite máximo alcanzado";
        var limMax = document.getElementById("limite2").disabled = true;
    }
}

function resetF() { 
    var input1 = document.getElementById("limite1").disabled=false;
    var input2 = document.getElementById("limite2").disabled=false;
    var output = document.getElementById("alcanzado");
    output.innerHTML="";

}