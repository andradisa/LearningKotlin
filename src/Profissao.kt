open class Profissao {

    //características
    var nome : String = ""
    private var idade: Int = 0
    private var generoMasculino : Boolean = true

    public fun changeSex() {
        generoMasculino = false
    }

    public fun changeAge(idade:Int) {
        this.idade = idade
    }

    public fun showAge() {
        println("A idade de $nome é de $idade anos.")
    }

    //métodos
    open fun faculdade() {
        println("$nome completou 4 anos de faculdade!")
    }

}

class Professor : Profissao () {

}