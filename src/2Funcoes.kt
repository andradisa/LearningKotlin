//funções executam ações

fun exibirMensagem (nome: String) {
    //bloco de código
    println ("você tem que comprar ração, $nome.")
}
//primeira forma de retornar, já completando o print na própria função
//não retorna porque não armazena em variavel
fun somarNumeros (numero1: Int, numero2: Int) {
    val totalNumeros = numero1 + numero2
    println("O resultado de sua soma é $totalNumeros.")

}

//segunda forma de somar, retornando o total e tendo que armazenar em variavel, dentro da fun main
fun somar (numero1: Int, numero2: Int): Int {
    val total = numero1 + numero2
    return total

}

fun multiplicar (numero1: Int, numero2: Int): Int {

    var total = numero1 * numero2
    println(total)
    return total
}



fun main (args: Array<String>) {

    exibirMensagem("Meredith")


    somarNumeros(2,3)


    val resultado = somar(6,7)
    println("O resultado de sua soma é $resultado.")

    val resultadoMultiplicar = multiplicar(2, 3)
}
