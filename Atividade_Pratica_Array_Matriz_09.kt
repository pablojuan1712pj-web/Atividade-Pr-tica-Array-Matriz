fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 0, 3),
        intArrayOf(0, 5, -2),
        intArrayOf(4, 0, 6)
    )

    var soma = 0

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            val valor = matriz[i][j]

            if (valor == 0) {
                continue
            }

            if (valor > 0) {
                soma += valor
            }
        }
    }

    println("Soma dos valores positivos: $soma")
}