import java.util.Scanner

fun main(args: Array<String>) {
    var listOfArchives = mutableListOf<Archive>()
    println("Добро пожаловать в приложение \"Заметки\"!")
    var flag : Boolean = true
    while (flag) {
        println("Пожалуйста, введите команду, которую необходимо выполнить:")
        println("Список архивов:")
        for (i in listOfArchives) {
            println(i.name)
        }
        println("0 - создать архив")
        println("1 - открыть архив")
        println("2 - выход из приложения")
        var answer = Scanner(System.`in`).nextLine()
        when (answer) {
            0.toString() -> {
                var newItem = Archive(name = "")
                newItem.createItem()
                listOfArchives.add(newItem)
            }
            1.toString() -> {
                if (listOfArchives.size == 0) {
                    println("Упс, нет архивов")
                    continue
                } else {
                    println("Введите название архива:")
                    var archiveAnswer = Scanner(System.`in`).nextLine()
                    if (archiveAnswer !is String) {
                        println("Введите название!")
                    } else {
                        for (i in listOfArchives) {
                            if (i.name.lowercase() == archiveAnswer.lowercase()) {
                                var flag2 = true
                                while (flag2) {
                                    println("Пожалуйста, введите команду, которую необходимо выполнить:")
                                    println("Список заметок:")
                                    for (k in i.tipsList) {
                                        println(k.name)
                                    }
                                    println("0 - создать заметку")
                                    println("1 - открыть заметку")
                                    println("2 - назад в меню")
                                    var newAnswer = Scanner(System.`in`).nextLine()
                                    when (newAnswer) {
                                        0.toString() -> {
                                            var newNote = Note("", "")
                                            newNote.createItem()
                                            i.tipsList.add(newNote)
                                        }
                                        1.toString() -> {
                                            if (i.tipsList.size == 0) {
                                                println("Упс, заметок нет")
                                                continue
                                            } else {
                                                println("Введите название заметки:")
                                                var noteAnswer = Scanner(System.`in`).nextLine()
                                                if (noteAnswer !is String) {
                                                    println("Введите название!")
                                                } else {
                                                    for (k in i.tipsList) {
                                                        if (k.name.lowercase() == noteAnswer.lowercase()) {
                                                            println(k.text)
                                                        } else {
                                                            println("Такой заметки нет")
                                                            break
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        2.toString() -> break
                                    }
                                }
                            } else {
                                println("Такого архива нет")
                                break
                            }
                        }
                    }
                }
            }
            2.toString() -> {
                println("До скорого!")
                break
            }
            else -> {
                println("Введите корректную команду!")
                continue
            }
        }
    }

}