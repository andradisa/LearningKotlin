fun main (args: Array<String>) {

    //var = variable, é variável. val = value, é imutável
    val nome1 = "Isabelle"
    val nome2 = "Daniel"
    var idadeNome1 = 20
    var idadeNome2 = 23

    println( "O nome da primeira pessoa é $nome1, e sua idade, $idadeNome1. Já a segunda pessoa recebe o nome de $nome2, e idade $idadeNome2.")
    // o símbolo de $ serve para identificar para o programa a variável

    val idadeFilozinha:Int = 5
    val idadeBolinho:Float = 3.5f

    println("Filózinha tem $idadeFilozinha anos e Bolinho, $idadeBolinho.")

    /*
    Para kotlin não é necessário especificar o tipo de variável, a linguagem tem inferência de tipo, e entende, caso preencha os requisitos

    nomenclatura de varáveis números
        Double: Precisão em números decimais
        Float: Precisão um pouco menor, é necessário usar o f no final do número
        Long: Números grandes, é necessário usar o L ao final do número
        Int: default, qualquer número
     */
    val texto1 = "eu gosto de gatos"
    val texto2:String = "eu gosto muito de gatos"
    val fofuraFilozinha:Boolean = true

    println(texto1)
    println(texto2)
    /*

    nomenclatura varáveis palavras
        string é qualquer forma de texto, deve ser utilizada com aspas "", não necessita ser definida, qualquer texto é string
        boolean somente true ou false
     */

    var gatos = arrayOf ("Filozinha", "Bolinho", "Vitu")
    println(gatos [0])
    /*
    Array é uma lista de elementos dentro de uma só variável
    a contagem começa sempre a partir do 0
     */
}