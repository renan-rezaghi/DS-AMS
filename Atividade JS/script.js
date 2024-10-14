function calcularIdade() {
    const anoNascimento = document.getElementById('ano-nascimento').value;
    const anoAtual = new Date().getFullYear();
    const idade = anoAtual - anoNascimento;

    if (anoNascimento === '' || anoNascimento > anoAtual) {
        document.getElementById('resultado').textContent = 'Por favor, insira um ano de nascimento válido.';
    } else {
        document.getElementById('resultado').textContent = `Sua idade é: ${idade} anos.`;
    }
}
