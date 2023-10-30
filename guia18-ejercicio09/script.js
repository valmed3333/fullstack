function separar() {
    var frase = document.getElementById("frase");
    var palabra = frase.value;
    var separada = "";
    var fraseSeparada = document.getElementById("fraseSeparada");
    for (let i = 0; i < palabra.length; i++) {

        // alert("->"+ palabra.substring(i,i+1) + "<-")
        // if (palabra.substring(i, i + 1) === " ") {
        //     separada = separada + " " + " " + palabra.substring(i, i + 1);
        // } else {
        // }
        separada = separada + "&nbsp" + palabra.substring(i, i + 1);

    }

    fraseSeparada.innerHTML = separada;
}
