fun main() {
    exibirNome()
    exibirNomeComComentario()
    operacoesMatematicas(10.0, 5.0)
    calcularAreaRetangulo(4.0, 6.0)
    exibirString("Vai Corinthians!!!")

    val itens = arrayOf("Maçã", "Banana", "Uva")
    exibirArray(itens)

    val lista = mutableListOf("Chuteira", "Meião")
    adicionarItemArray(lista, "Bola de futsal")
    println(lista)

    validarSenha("1234", "1235")
    compararValores(110, 220)
    repetirMensagem("Tá na hora do pau!", 3)
}


fun exibirNome() {
    println("Meu nome é Renan")
}


fun exibirNomeComComentario() {
    // Esta função exibe o nome
    println("Meu nome é Renan")
}

fun operacoesMatematicas(a: Double, b: Double) {
    println("Soma: ${a + b}")
    println("Subtração: ${a - b}")
    println("Multiplicação: ${a * b}")
    println("Divisão: ${a / b}")
}


fun calcularAreaRetangulo(largura: Double, altura: Double) {
    val area = largura * altura
    println("A área do retângulo é: $area")
}


fun exibirString(mensagem: String) {
    println("A mensagem é: $mensagem")
}


fun exibirArray(itens: Array<String>) {
    for (item in itens) {
        println(item)
    }
}

fun adicionarItemArray(array: MutableList<String>, novoItem: String) {
    array.add(novoItem)
    println("Item adicionado: $novoItem")
}


fun validarSenha(senhaCorreta: String, tentativa: String) {
    if (senhaCorreta == tentativa) {
        println("Acesso permitido")
    } else {
        println("Acesso negado")
    }
}

fun compararValores(a: Int, b: Int) {
    if (a > b) {
        println("Maior: $a, Menor: $b")
    } else if (b > a) {
        println("Maior: $b, Menor: $a")
    } else {
        println("Os valores são iguais: $a")
    }
}

fun repetirMensagem(mensagem: String, vezes: Int) {
    for (i in 1..vezes) {
        println("$i: $mensagem")
    }
}