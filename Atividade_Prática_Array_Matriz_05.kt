fun main(){
    val tarefas = arrayOf(
        "Estudar Kotlin",
        "Fazer exercícios",
        "Ler um livro",
        "Organizar os arquivos",
        "Revisar o conteúdo"
    )

    for ((indice, tarefa) in tarefas.withIndex()){
        println("Tarefa ${indice + 1}: $tarefa")
    }
}