function invertirPalabra() {
    var palabra = document.getElementById("palabra").value;
    var palabraReves = "";
    
    for (var i = palabra.length - 1; i >= 0; i--) {
        palabraReves += palabra[i];
    }
    document.getElementById("resultado").focus();
    document.getElementById("resultado").value = palabraReves;
    
}