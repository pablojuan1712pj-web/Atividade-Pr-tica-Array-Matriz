fun main(){
    val produtos = arrayOf("Camiseta", "Calça", "Tênis")

    for ((indice, produto) in produtos.withIndex()){
        println("Item ${indice + 1} : $produto")
    }
}