fun main(){
    val codigo = arrayOf("TR001", "TR002", "TR003", "TR004", "TR005")
    val procurado = "TR003"


    for (i in codigo.indices) {
        if (codigo[i] == procurado) {
            println("Código encontrado na posição: $i")
            break
        }
    }
}