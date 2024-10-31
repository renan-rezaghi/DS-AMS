function calculate() {
    const n1 = parseFloat(document.getElementById('n1').value);
    const n2 = parseFloat(document.getElementById('n2').value);
    const operation = document.getElementById('operation').value;

    let result;

    if (isNaN(n1) || isNaN(n2)) {
        result = "Por favor, digite um valor válido.";
    } else {
        switch (operation) {
            case "Adição":
                result = n1 + n2;
                break;
            case "Subtração":
                result = n1 - n2;
                break;
            case "Multiplicação":
                result = n1 * n2;
                break;
            case "Divisão":
                result = n2 === 0 ? "Infinito" : n1 / n2;
                break;
            default:
                result = "Operação inválida";
        }
    }

    document.getElementById('result').innerText = "Resultado: " + result;
}
