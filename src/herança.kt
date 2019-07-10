//entendendo o conceito de herança

open class Medico(var nome: String) {

    //métodos
    fun faculdadeMedicina() {
        println("$nome teve de completar os 5 anos da faculdade de medicina.")
    }

    open fun residencia() {
        println("$nome teve de passar pela residência hospitalar.")
    }
}

class Dermatologista: Medico("") {}

class Psiquiatra: Medico("") {
    override fun residencia(){
        super.residencia()
        println("E, também, a residência psiquiatra.")
    }
}

fun main (args: Array<String>) {
    val jorgeDermato = Dermatologista().also {
        it.faculdadeMedicina()
        it.residencia()
    }

    /*
    val martaPsiq = Psiquiatra() {
        martaPsiq.residencia()
    }
    
     */
}