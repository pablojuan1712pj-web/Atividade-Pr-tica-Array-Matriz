fun main() {
// Matriz 3x4: 3 regiões (linhas) e 4 dias (colunas)
    val faturamento = arrayOf(
        doubleArrayOf(120.5, 150.0, 210.0, 90.0), // Região 0 (Norte)
        doubleArrayOf(300.0, 280.5, 410.0, 390.0), // Região 1 (Sul)
        doubleArrayOf(50.0, 80.0, 110.0, 95.0) // Região 2 (Leste)
    )
    var faturamentoTotalApp = 0.0
    var melhorFaturamentoRegional = 0.0
    var regiaoCampeã = 0
// O laço externo percorre as linhas (Regiões)
    for (linha in faturamento.indices) {
        var somaDaRegiaoAtual = 0.0
// O laço interno percorre as colunas (Dias) da região atual
        for (coluna in faturamento[linha].indices) {
            val valorDoDia = faturamento[linha][coluna]
            somaDaRegiaoAtual += valorDoDia
            faturamentoTotalApp += valorDoDia
        }
        println("Faturamento Região $linha: R$ $somaDaRegiaoAtual")
// Estrutura condicional para salvar a melhor região até o momento
        if (somaDaRegiaoAtual > melhorFaturamentoRegional) {
            melhorFaturamentoRegional = somaDaRegiaoAtual
            regiaoCampeã = linha
        }
    }
    println("-------------------------------------------------")
    println("Faturamento TOTAL do aplicativo: R$ $faturamentoTotalApp")
    println("A Região $regiaoCampeã foi a mais lucrativa (R$ $melhorFaturamentoRegional)")
}