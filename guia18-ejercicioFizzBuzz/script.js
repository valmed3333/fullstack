function fizzBuzz() {
    // var numeroObjeto = document.getElementById("numero");
    // alert(numeroObjeto.value);
    // var numero = parseFloat(numeroObjeto.value);
    
    var tagObjeto = document.getElementById("tag");
    var parrafo = "hola hola";
    var dato = "";
    var index;
    for (index = 0; index < 100; index++) {
        let numero = index + 1;

        if (numero % 3 == 0 && numero % 5 == 0) {
            dato = "Fizz Buzz";
        } else if (numero % 5 == 0) {
            dato = 'Buzz';
        } else if (numero % 3 == 0) {
            dato = 'Fizz';
        } else {
            dato = numero;
        }
        console.log('dato: ', dato, typeof dato);
        if (index == 0) {
            parrafo = dato;
        } else {
            parrafo = parrafo + "<br>" + dato;
        }
    }

    tagObjeto.innerHTML = parrafo;
}

function fizzBuzz2() {
    // var numeroObjeto = document.getElementById("numero");
    // alert(numeroObjeto.value);
    // var numero = parseFloat(numeroObjeto.value);
    // alert("Hola cindy");
    var tagObjeto = document.getElementById("tag");
    var parrafo = "hola hola";
    var dato = "";
    var index;
    var tres=0;
    var cinco=0;
    var quince=0;
    for (index = 0; index < 100; index++) {
        let numero = index + 1;
        tres++;
        cinco++;
        quince++;

        if (quince==15) {
            dato = "Fizz Buzz";
            quince=0;
            cinco=0;
            tres=0;
        } else if (cinco==5) {
            dato = 'Buzz';
            cinco=0;
        } else if (tres==3) {
            dato = 'Fizz';
            tres=0;
        } else {
            dato = numero;
        }
        console.log('dato: ', dato, typeof dato);
        if (index == 0) {
            parrafo = dato;
        } else {
            parrafo = parrafo + "<br>" + dato;
        }
    }

    tagObjeto.innerHTML = parrafo;
}