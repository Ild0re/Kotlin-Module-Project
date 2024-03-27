import java.util.Scanner

data class Note (
    val name: String = "",
    val text: String = ""
) : CreateItem {
    companion object {
        fun createItem(): Note {
            while (true) {
                println("Пожалуйста, введите название заметки:")
                val newName = Scanner(System.`in`).nextLine()
                if (newName !is String || newName.isEmpty()) {
                    println("Название должно быть строкой!")
                } else {
                    while (true) {
                        println("Пожалуйста, введите текст заметки:")
                        val newText = Scanner(System.`in`).nextLine()
                        if (newText !is String || newText.isEmpty()) {
                            println("Текст должен быть строкой!")
                        } else {
                            return Note(newName, newText)
                        }
                    }

                }

            }
        }
    }


}