fun main() {
    val notas = Array(3) { DoubleArray(2) }

    notas[0] = doubleArrayOf(8.0, 7.0)
    notas[1] = doubleArrayOf(5.0, 6.0)
    notas[2] = doubleArrayOf(9.0, 10.0)

    var somaMedias = 0.0

    for (i in notas.indices) {
        val media = (notas[i][0] + notas[i][1]) / 2

        println("Aluno ${i + 1}: Média = $media")

        if (media >= 7.0) {
            println("Situação: Aprovado")
        } else {
            println("Situação: Reprovado")
        }

        somaMedias += media
    }

    val mediaGeral = somaMedias / notas.size

    println("Média geral da turma: $mediaGeral")
}