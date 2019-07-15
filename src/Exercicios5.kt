
//https://morettic.com.br/wp2/poo/poo-lista-de-exercicios-3/
fun main (args: Array<String>) {
    val cleberson = Proprietario5("Cleberson Matos da Silva", "111111111", "11111111111")

    cleberson.mudarBairro("Senador Camará")
    cleberson.mostrarBairro()
    val clebersonCep = cleberson.mudarCep("23035372")


}