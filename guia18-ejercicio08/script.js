var numeros = [];
var numeroInput = document.getElementById('numeroInput');
var agregarBtn = document.getElementById('agregarBoton');
numeroInput.addEventListener('keypress', function (event) {
    if (event.key === 'Enter') {
        if (!isNaN(+numeroInput.value)) {
            agregarBtn.click();
        }
    }
});
    agregarBtn.addEventListener('click', () => {
        const numero = parseInt(numeroInput.value);
        if (numero === 0) {
            calcularResultados();
        } else {
            numeros.push(numero);
            numeroInput.value = '';
            numeroInput.focus();
        }
    });
function calcularResultados() {

    var maximoSpan = document.getElementById('maximo');
    var minimoSpan = document.getElementById('minimo');
    var promedioSpan = document.getElementById('promedio');
    var lista = document.getElementById("lista");


    var numero = parseInt(numeroInput.value);
    if (numero === 0) {
        // alert(numeros.length);
        if (numeros.length > 0) {
            var maximo = Math.max(...numeros);
            var minimo = Math.min(...numeros);
            // var suma=0;
            // numeros.forEach(element => {
            //     suma=suma+element;
            // });
            // var promedio2 = suma/numeros.length;
            // alert(promedio2);
            // var promedio = numeros.reduce(
            //     function reducer(acumulador, valorActual){
            //         return acumulador +valorActual ;
            //         })/numeros.length;

            var promedio = numeros.reduce((suma, num) => suma + num) / numeros.length;

            maximoSpan.textContent = maximo;
            minimoSpan.textContent = minimo;
            promedioSpan.textContent = promedio.toFixed(2);

        } else {
            maximoSpan.textContent = 'Ningún valor ingresado';
            minimoSpan.textContent = 'Ningún valor ingresado';
            promedioSpan.textContent = 'Ningún valor ingresado';
        }
    } else {
        // alert("Hola");
        numeros.push(numero);
        numeroInput.value = '';
        numeroInput.focus();
    }

}