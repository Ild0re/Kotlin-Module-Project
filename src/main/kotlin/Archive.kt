import java.util.Scanner

data class Archive(
    var name: String,
    var tipsList: MutableList<Note> = mutableListOf()
) : CreateItem {
    override fun createItem(): Any {
        while (true) {
            println("Пожалуйста, введите название архива:")
            var answer = Scanner(System.`in`).nextLine()
            if (answer !is String || answer.isEmpty()) {
                println("Название должно быть строкой!")
            } else {
                this.name = answer
                break
            }

        }
        return this
    }
}