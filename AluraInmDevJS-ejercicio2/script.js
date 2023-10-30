var numeroSecreto = parseInt(Math.random() * 999 + 1);
let cont = 0;
let gano = false;
// document.getElementById("numeroSecreto").focus();
// document.("numeroSecreto") = numeroSecreto;

function evaluarNumero() {
  if (gano == false) {
    cont++;
    var limInf = document.querySelector("#limInf");
    var limSup = document.querySelector("#limSup");
    var siguiente = document.querySelector("#siguiente");

    var contador = document.querySelector("#contador");
    contador.textContent = cont;
    var numeroDigitado = parseInt(document.getElementById("numero").value);
    var parrafo = document.querySelector("#resultado");
    if (numeroSecreto == numeroDigitado) {
      if (cont == 1) {
        parrafo.textContent =
          "Acertaste en un solo intento Bravo!! El número secreto era " +
          numeroDigitado;
        gano = true;
      } else {
        parrafo.textContent =
          "Acertaste en " +
          cont +
          " intentos, el número secreto era " +
          numeroDigitado;
        gano = true;
      }
    } else if (numeroSecreto > numeroDigitado) {
      limInf.textContent = numeroDigitado;
      parrafo.textContent =
        "El número secreto es mayor que " +
        numeroDigitado +
        ", inténtalo de nuevo";
    } else if (numeroSecreto < numeroDigitado) {
      limSup.textContent = numeroDigitado;
      parrafo.textContent =
        "El número secreto es menor que " +
        numeroDigitado +
        ", inténtalo de nuevo";
    }

    siguiente.textContent = Math.round(
      (parseInt(limSup.textContent) + parseInt(limInf.textContent)) / 2
    );
    let numero = document.getElementById("numero");
    numero.value = Math.round(
      (parseInt(limSup.textContent) + parseInt(limInf.textContent)) / 2
    );
  }
  //   document.getElementById("resultado").focus();
  //   document.getElementById("resultado").value = resultado;
}
//   var numeroSecreto = parseInt(Math.random() * 999 + 1);
//   var cont = 0;

//   //Condicional para
//   do {
//     var numeroDigitado = prompt("Ingresa un número entre 1 y 1000");
//     cont++;
//
//     }
//   } while (numeroSecreto != numeroDigitado);

// alert(
//   "Bienvenid@ al mentalista, trata de adivinar un número en la menor cantidad de intentos posibles"
// );

function recargar() {
  window.location.reload();
}

document.addEventListener("DOMContentLoaded", function () {
  let numero = document.getElementById("numero");
  let button = document.getElementById("evaluar");

  numero.addEventListener("keydown", function (event) {
    if (event.key === "Enter") {
      event.preventDefault(); // Evita que se ejecute el comportamiento predeterminado de la tecla Enter (enviar formulario o insertar un salto de línea)
      button.click(); // Simula un clic en el botón
      //   numero.value = "";
    }
  });
});
