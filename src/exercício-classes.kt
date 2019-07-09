class Gato{
    //características
    var nome: String = ""
    var acimaPeso: Boolean = true
    var idade: Int = 1
    var asleep: Boolean = true

    //ações
    fun ronronar(){
        println("$nome está ronronando!")
    }

    fun mimilson() = if (asleep == true) {
        println("$nome está mimilson tranquilamente!")
    } else {
        println("$nome não precisa mimilson agora! Talvez um petisco caia bem!")
    }


    fun verificarPeso() = if (acimaPeso == true){
        println("caramba, $nome está acima do peso")
    } else{
        println("mas não tem nada na barriguinha de $nome?")
    }

    fun mostrarIdade(){
        println("a idade do seu gatinho é $idade anos!")
    }

}

fun main (args: Array<String>) {

    val filozinha = Gato()
    filozinha.nome = "filomena"
    filozinha.asleep = true
    filozinha.acimaPeso = false
    filozinha.idade = 5
    filozinha.mimilson()
    filozinha.verificarPeso()
    filozinha.mostrarIdade()

    val bolinho = Gato()
    bolinho.nome = "Bolinácio"
    bolinho.asleep = false
    bolinho.acimaPeso = true
    bolinho.idade = 3
    bolinho.mimilson()
    bolinho.mostrarIdade()
    bolinho.verificarPeso()
    bolinho.ronronar()

}