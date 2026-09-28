package lessons.lesson08.homeworks

import java.io.File
import java.time.LocalDateTime

fun main() {
    //1
    stringConversion("Это невозможно выполнить за один день")
    stringConversion("Я не уверен в успехе этого проекта")
    stringConversion("Произошла катастрофа на сервере")
    stringConversion("Этот код работает без проблем")
    stringConversion("Удача")
    stringConversion("")
    stringConversion("Сверху пустая строка")

    //2
    extractingTheDateFromLogString ("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    //3
    personalDataMasking ("4539 1488 0343 6467")

    //4
    emailAddressFormatting("username@example.com")

    //5
    extractingTheFileNameFromThePath ("C:/Пользователи/Документы/report.txt")
    extractingTheFileNameFromThePath ("D:/good.themes/dracula.theme")

    //6
    creatingAcronymFromPhrase ("Котлин лучший язык программирования")
    creatingAcronymFromPhrase ("Ну тут может быть какой-то текст с пробелами")
    creatingAcronymFromPhrase ("")
}

fun stringConversion (text: String)  {
/*
1. Преобразование строк
Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно
изменять фразу.
Правила проверки и преобразования:
1 Если фраза содержит слово "невозможно":
Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
2 Если фраза начинается с "Я не уверен":
Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
3 Если фраза содержит слово "катастрофа":
Преобразование: Замените "катастрофа" на "интересное событие".
4 Если фраза заканчивается на "без проблем":
Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
5 Если фраза содержит только одно слово:
Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".
*/

    var newText = when {
        text.contains("невозможно", ignoreCase = true) -> text.replace("невозможно",
            "совершенно точно возможно, просто требует времени")
        text.startsWith("Я не уверен", ignoreCase = true) -> "$text, но моя интуиция говорит об обратном"
        text.contains("катастрофа", ignoreCase = true) -> text.replace("катастрофа",
                                                                    "интересное событие")
        text.endsWith("без проблем", ignoreCase = true) -> text.replace("без проблем",
                                                                    "с парой интересных вызовов на пути")
        !text.contains(" ") && text.isNotEmpty() -> "Иногда, $text, но не всегда"
        else -> text
    }

    println(newText)
}


fun extractingTheDateFromLogString (log: String) {
/*
2. Извлечение даты из строки лога
У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23"
(данные могут быть любыми, но формат всегда такой). Извлеките отдельно дату и время из этой строки и
сразу распечатай их по очереди.
Используй indexOf или split для получения правой части сообщения.
*/
    // Оберзаем строку по индексу + 2 элемента "->" и убираем пробелмы с помощью trim()
    var dateTime = log.substring(log.indexOf("->") + 2).trim()

/*
Можно разделить на 2 части
var split = dateTime.split(" ")
println(split[0])
println(split[1])
*/
    println(dateTime.split(" ")[0])
    println(dateTime.split(" ")[1])
}

fun personalDataMasking (text :String) {
/*
3. Маскирование личных данных
Дана строка с номером кредитной карты, например "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех,
символами "*".
*/
    var deleteSpacesMaskPersonalData = text.replace(" ", "")
    var lastFourNumbers = deleteSpacesMaskPersonalData.substring(deleteSpacesMaskPersonalData.length - 4 ,
                                                                    deleteSpacesMaskPersonalData.length)
    var maskPersonalData = "*".repeat(deleteSpacesMaskPersonalData.length - 4) + lastFourNumbers
    println(maskPersonalData)
}

fun emailAddressFormatting(email :String) {
/*
4. Форматирование адреса электронной почты.
У вас есть электронный адрес, например "username@example.com". Преобразуйте его в строку "username [at] example [dot] com", используя функцию replace()
*/

    var formattedEmail = email.replace("@", " [at] ")
                                .replace("." , " [dot] ")

    println(formattedEmail)
}

fun extractingTheFileNameFromThePath (path: String) {
/*
5. Извлечение имени файла из пути.
Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme" (может быть любым).
Извлеките название файла с расширением.
*/

    var file = path.split("/").last()
    println(file)
}

fun creatingAcronymFromPhrase (text: String) {
/*
6. Создание аббревиатуры из фразы.
У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов - пробел).
Создайте аббревиатуру из начальных букв слов (например, "ООП").
Используйте split. Используйте for для перебора слов. Используйте var переменную для накопления первых букв.
*/

    var splitText = text.split(" ")
    var abbr = ""

    for (word in splitText) {
        //проверка на пустоту
        if (word.isNotEmpty()){
            //тк у нас каждый текст состоит из чар можно условиться на 0 чар из массива
            abbr += word[0].uppercase()
        }
    }

    println(abbr)
}