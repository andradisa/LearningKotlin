class Proprietario5(private var nome: String, private var rg: String, private var cpf: String) {

    private var nascimento : String = ""
    private var rua : String = ""
    private var bairro : String = ""
    private var cidade : String = ""
    private var estado : String = ""
    private var cep : String = ""
    private var complemento : String = ""

    fun mudarNascimento(nascimento: String) {
        this.nascimento = nascimento
    }

    fun mostrarNascimento(): String {
        println(nascimento)
        return nascimento
    }

    fun mmudarRua(rua: String) {
        this.rua = rua
    }

    fun mostrarRua():String {
        println(rua)
        return rua
    }

    fun mudarBairro(bairro: String) {
        this.bairro = bairro
    }

    fun mostrarBairro(): String {
        println(bairro)
        return bairro
    }

    fun mudarCidade(cidade: String){
        this.cidade = cidade
    }

    fun mostrarCidade(): String {
        println(cidade)
        return cidade
    }

    fun mudarEstado(estado: String) {
        this.estado = estado
    }

    fun mostrarEstado(): String {
        println(estado)
        return estado
    }

    fun mudarCep(cep: String) {
        this.cep = cep
    }

    fun mostrarCep(): String {
        println()
        return cep
    }

    fun mudarComplemento(complemento: String) {
        this.complemento = complemento
    }

    fun mostrarComplemento(): String {
        println(complemento)
        return complemento
    }
}

