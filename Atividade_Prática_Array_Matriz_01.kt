fun main(){
    val numeros = intArrayOf(10, 20, 30, 40, 50, 60)

    var inicial = 0
    var fim = numeros.size - 1

    while (inicial < fim) {
        val temp = numeros[inicial]
        numeros[inicial] = numeros[fim]
        numeros[fim] = temp

        inicial++
        fim--
    }

    println(numeros.contentToString())
}