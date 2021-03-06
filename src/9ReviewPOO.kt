/* Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto
dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de
trabalho. Escreva os seguintes métodos para esta classe:
media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final) */


class Estudantes{

    //propriedades
    var nome: String = ""
    var matricula: Int = 0
    var prova1: Double = 0.0
    var prova2: Double = 0.0
    var notaTrabalho: Double = 0.0

    // métodos
    fun media():Double {
        var resultadoMedia = (prova1*2.5+prova2*2.5+notaTrabalho*2)/7


        return if (resultadoMedia >= 6){
            println("A aluna de $nome, cuja matrícula é $matricula, atingiu a nota desejada, tendo tirado $prova1 na " +
                    "primeira avaliação, $prova2 na segunda e nota $notaTrabalho no trabalho proposto, " +
                    "portanto a aluna obteve média $resultadoMedia.")
            0.0
        } else {
            println("A aluna de $nome, cuja matrícula é $matricula, não atingiu a nota desejada, tendo tirado $prova1 na " +
                    "primeira avaliação, $prova2 na segunda e nota $notaTrabalho no trabalho proposto, " +
                    "portanto a aluna obteve média $resultadoMedia, assim sendo necessária aplicação de prova final.")

            final(resultadoMedia)
            resultadoMedia
        }


    }

    fun final(resultadoMedia: Double): Double {
        var notaRequerida = 12 - resultadoMedia

        println("A fim de ser aprovada na disciplina, a aluna $nome deve tirar nota igual ou superior a $notaRequerida.")
        return notaRequerida
    }

}

fun main (args: Array<String>) {

    //aluno 1
    var aluno1 = Estudantes()
    aluno1.nome = "Alessandra de Moraes"
    aluno1.matricula = 1601
    aluno1.prova1 = 8.5
    aluno1.prova2 = 6.5
    aluno1.notaTrabalho = 9.0

    aluno1.media()

    //aluno 2
    var aluno2 = Estudantes()
    aluno2.nome = "Carolina Veiga"
    aluno2.matricula = 1602
    aluno2.prova1 = 2.0
    aluno2.prova2 = 5.5
    aluno2.notaTrabalho = 6.0

    aluno2.media()

}