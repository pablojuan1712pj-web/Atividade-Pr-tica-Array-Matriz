fun main() {
    val salaCinema = Array(3) { IntArray(4) }
    salaCinema[0][2] = 1
    salaCinema[2][3] = 1
    println("=== MAPA DA SALA ===")
    for (linha in salaCinema) {
        for (poltrona in linha) {
            if (poltrona == 1) print("[X] ") else print("[ ] ")
        }
        println()
    }
}