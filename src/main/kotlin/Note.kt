import java.util.Scanner

class Note (
    var name: String,
    var text: String
) : CreateItem {
    override fun createItem(): Any {
        var flag: Boolean = true
        while (flag) {
            println("Пожалуйста, введите название заметки:")
            var answer = Scanner(System.`in`).nextLine()
            if (answer !is String) {
                println("Название должно быть строкой!")
            } else {
                this.name = answer
                println("Пожалуйста, введите текст заметки:")
                var newText = Scanner(System.`in`).nextLine()
                if (newText !is String) {
                    println("Текст должен быть строкой!")
                } else {
                    this.text = newText
                    break
                }
            }

        }
        return this
    }
}