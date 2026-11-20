fun main() {
    val precosCarrinho = doubleArrayOf(25.50, 0.0, 45.00, 12.30)
    var subtotal = 0.0
    for (preco in precosCarrinho) {
        if (preco == 0.0) {
            println("Item esgotado removido do cálculo.")
            continue // Pula para a próxima iteração do laço
        }
        subtotal += preco
    }
    println("Subtotal do pedido FoodExpress: R$ $subtotal")
}