class Casa{

    //propriedades
    var cor: String = ""
    //this.cor(corParede: String)

    //métodos
    fun abrirJanela(quantidadeJanelas: Int){
        println("$quantidadeJanelas janelas da casa foram abertas")
    }

    fun abrirPorta(){
        println("a porta foi aberta")
    }

    fun abrirCasa(){
        this.abrirJanela(10)
        this.abrirPorta()
    }

}

fun main (args: Array<String>) {

    val casa = Casa()
    casa.cor = "amarela"
    casa.abrirJanela(4)


    println(casa.cor)

}