import java.util.Scanner

class Archive(
    var name: String,
    var tipsList: MutableList<Note> = mutableListOf()
) : CreateItem {
    override fun createItem(): Any {
        var flag: Boolean = true
        while (flag) {
            println("Пожалуйста, введите название архива:")
            var answer = Scanner(System.`in`).nextLine()
            if (answer !is String) {
                println("Название должно быть строкой!")
            } else {
                this.name = answer
                break
            }

        }
        return this
    }
}