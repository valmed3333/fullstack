function Calcular() {
    var num1 = parseFloat(document.getElementById('num1').value);
    var num2 = parseFloat(document.getElementById('num2').value);
    var operation = document.getElementById('operation').value.toUpperCase();
    if (num1 == '' || isNaN(num1)) {
        alert("El número 1 no es válido");
    } else if (num2 == '' || isNaN(num2)) {
        alert("El numero 2 no es valido");
    } else if (operation == "S" || operation == "s" || operation == "R" || operation == "r"
        || operation == "M" || operation == "m" || operation == "D" || operation == "d") {
        switch (operation) {
            case 'S' || 's':
                var result = document.getElementById("result");
                var operation = num1 + num2;
                result.value = (num1 + " + " + num2 + " = " + operation);
                // result.innerHTML = "Resultado " + num1 + " + " + num2 + " = " + operation;
                // document.write(<)
                ; break;
            case 'R' || 'r':
                result = document.getElementById("result");
                result.setAttribute("type", "")
                var operation = num1 - num2;
                result.value = (num1 + " - " + num2 + " = " + operation);
                // result.innerHTML = "Resultado " + num1 + " - " + num2 + " = " + operation;
                break;
            case 'M' || 'm':
                result = document.getElementById("result");
                var operation = num1 * num2;
                result.value = (num1 + " x " + num2 + " = " + operation);
                // result.innerHTML = "Resultado " + num1 + " x " + num2 + " = " + operation;
                break;
            case 'D' || 'd':
                result = document.getElementById("result");
                var operation = num1 / num2;
                result.value = (num1 + " / " + num2 + " = " + operation);
                // result.innerHTML = "Resultado " + num1 + " / " + num2 + " = " + operation;
                break;
            default:
                console.log(`No se reconoce la operación ${operation}`);
        };
    } else { alert("La operación seleccionada no existe") }


}
