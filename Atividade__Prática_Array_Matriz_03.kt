fun main(){
    val temperaturas =doubleArrayOf(28.5, 30.0, 27.0, 32.5, 31.0, 29.0, 33.0)

    var soma = 0.0

    for(temp in temperaturas){
        soma += temp

    }

    val media = soma / temperaturas.size

    println("Média semanal: $media")

    for (i in temperaturas.indices){
        if (temperaturas[i] > media){
            println("Dia $i: ${temperaturas[i]}ºC")
        }
    }
}