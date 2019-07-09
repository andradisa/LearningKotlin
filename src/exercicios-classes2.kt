//entendendo o conceito de construtores

class Peixe(var cor: String, var aguaSalgada: Boolean){

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
    fun nadar(){
        println("o peixinho está nadando! Sua cor é $cor e ele")

        if (aguaSalgada == true) print("é um peixinho de água salgada!")
        else print("não é um peixinho de água salgada.")
    }

}

fun main (args: Array<String>) {

    val peixe1 = Peixe("azul", true)
    peixe1.nadar()
}