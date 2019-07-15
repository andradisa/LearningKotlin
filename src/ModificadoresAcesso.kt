/**
Public – Um método definido como Public pode ser acessado por qualquer classe de qualquer projeto (Assembly).
Protected – Somente as classes que herdam da classe que contem o método protegido (protected) tem permissão para acessá-lo.
Internal -  Os métodos deste tipo somente podem ser acessados por classes que pertencem ao mesmo assembly que eles, com ou sem herança.
Private – Este modificador é o mais restrito, somente a classe onde ele foi definido é que pode acessá-lo, nenhuma outra tem permissão, nem mesmo as classes que herdam da classe onde o método foi definido.
*/

fun main (args: Array<String>) {
    val feliprof = Professor()

    feliprof.nome = "Felipe"
    feliprof.faculdade()
    feliprof.changeSex()
    feliprof.changeAge(58)
    feliprof.showAge()

    val joanaProf = Professor()

    joanaProf.showAge()
}