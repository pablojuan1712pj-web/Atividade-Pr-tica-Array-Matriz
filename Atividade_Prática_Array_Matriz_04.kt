fun main(){
    val numeros = IntArray(20) {it + 1}


    var soma = 0

    for (i in numeros.indices step 2){

        soma += numeros[i]
        println("Índice $i: ${numeros[i]}")
    }

    println("Soma dos valores: $soma")
}