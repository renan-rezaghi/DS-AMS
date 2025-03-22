fun main() {
    // 1. Estrutura de decisão - IF ELSE
    val numero = 10
    if (numero > 0) {
        println("Exercício 1: O número é positivo.")
    } else {
        println("Exercício 1: O número é negativo ou zero.")
    }

    // 2. Estrutura de Decisão - When
    val dia = 2
    when (dia) {
        1 -> println("Exercício 2: Domingo")
        2 -> println("Exercício 2: Segunda-feira")
        3 -> println("Exercício 2: Terça-feira")
        4 -> println("Exercício 2: Quarta-feira")
        5 -> println("Exercício 2: Quinta-feira")
        6 -> println("Exercício 2: Sexta-feira")
        7 -> println("Exercício 2: Sábado")
        else -> println("Exercício 2: Dia inválido")
    }

    // 3. Estrutura de Decisão - For
    println("Exercício 3: Contagem de 1 a 5 usando for")
    for (i in 1..5) {
        println("Número: $i")
    }

    // 4. Estrutura de Repetição - Exibir todos os itens de um array
    val lista = arrayOf("Bola", "Garrafa", "Uva", "Mesa", "Controle", "Luva")
    println("Exercício 4: Exibindo todos os itens do array")
    for (fruta in lista) {
        println(fruta)
    }

    // 5. Exibir o 6º elemento da array
    if (lista.size >= 6) {
        println("Exercício 5: O sexto elemento do array é: ${lista[5]}")
    } else {
        println("Exercício 5: O array não tem 6 elementos.")
    }

    // 6. Estrutura de Repetição - While
    var contador = 0
    println("Exercício 6: Contagem usando while")
    while (contador < 5) {
        println("Contador: $contador")
        contador++
    }

    // 7. Função de soma
    println("Exercício 7: Soma 5 + 3 = ${soma(5, 3)}")

    // 8. Função de subtração
    println("Exercício 8: Subtração 10 - 4 = ${subtracao(10, 4)}")

    // 9. Função de multiplicação
    println("Exercício 9: Multiplicação 6 * 2 = ${multiplicacao(6, 2)}")

    // 10. Função de divisão
    println("Exercício 10: Divisão 20 / 4 = ${divisao(20, 4)}")
}

// Funções matemáticas
fun soma(a: Int, b: Int): Int {
    return a + b
}

fun subtracao(a: Int, b: Int): Int {
    return a - b
}

fun multiplicacao(a: Int, b: Int): Int {
    return a * b
}

fun divisao(a: Int, b: Int): Int {
    return if (b != 0) a / b else throw IllegalArgumentException("Divisão por zero não permitida!")
}
