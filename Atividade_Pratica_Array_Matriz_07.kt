fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val transposta = Array(3) { IntArray(2) }

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            transposta[j][i] = matriz[i][j]
        }
    }

    println("Matriz original:")
    for (linha in matriz) {
        println(linha.contentToString())
    }

    println("Matriz transposta:")
    for (linha in transposta) {
        println(linha.contentToString())
    }
}