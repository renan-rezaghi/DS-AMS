function verificarParImpar() {
    const numero = document.getElementById('numero').value;

    if (numero === '') {
        document.getElementById('resultado').textContent = 'Por favor, insira um número válido.';
    } else {
        const resultado = (numero % 2 === 0) ? 'par' : 'ímpar';
        document.getElementById('resultado').textContent = `O número ${numero} é ${resultado}.`;
    }
}
