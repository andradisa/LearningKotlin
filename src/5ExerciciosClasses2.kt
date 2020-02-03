//entendendo o conceito de construtores

class Peixe(var cor: String, var aguaSalgada: Boolean, var idade: Int) {

    //caso não haja o var ali em cim, é necessário fazer init:

    /*
    var nome = ""
    var cor: String = ""
    var aguaSalgada: Boolean = true

    init {
        this.cor = cor
        this.aguaSalgada = aguaSalgada
    }
    */

    fun nadar() {
        print("o peixinho está nadando! Sua cor é $cor e ele ")

        if (aguaSalgada == true) println("é um peixinho de água salgada!")
        else println("não é um peixinho de água salgada.")
    }

    fun mostrarIdade() {
        if (idade < 3) {
            println("dá pro caldo!")
        } else if (idade < 5) {
            println("idosinho mas a gente leva")
        } else {
            println("que que isso, já comprou o caixão?")
        }
    }

}

fun main (args: Array<String>) {

    val peixe1 = Peixe("azul", true, 2)
    peixe1.nadar()
    peixe1.mostrarIdade()
}