package lessons.lesson08.homeworks

fun main() {
    //7
    allWordsCapitalized ("сегодня мы изучаем строки")
    allWordsCapitalized ("мЫ прОбудем Всякий тАкой Текст 123 ываввыа")

    //8
    encrypt("Kotlin")
    encrypt("C++")
    decrypt("oKltni")

    //9
    multiplicationTable(40,40)

}

fun allWordsCapitalized (text: String) {
/*
7. Все слова с большой буквы
    Напишите метод, который преобразует строку из нескольких слов в строку,
    где каждое слово начинается с заглавной буквы а все остальные - строчные.
    Используй перебор, анализ символов и замену букв на заглавную с помощью метода uppercase() для конкретной буквы.
*/
    var SplitAllWordsCapitalized = text.split(" ")
    var newText = ""

    for (word in SplitAllWordsCapitalized) {
        var firstChar = word[0].uppercase()
        var lastChars = word.substring(1).lowercase()
        newText += " $firstChar$lastChars" //не нравится такое решение, т.к. создается 1 пустой символ (костыль)
        //newText += "$firstChar$lastChars "
    }
    //TODO: сделать проверку на пустоту
    newText = newText.substring(1)
    println(text)
    println(newText)

}

/*
8. Игра в разведчика
    Напишите шифратор/дешифратор для строки.
    Шифровка производится путём замены двух соседних букв между собой: Kotlin шифруется в oKltni.
    Дешифровка выполняется аналогично.
    Если длина строки - нечётная, в конец добавляется символ пробела до начала шифрования.
    Таким образом все шифрованные сообщения будут с чётной длинной.
    Должно получиться два публичных метода: encrypt() и decrypt() которые принимают строку и печатают результат в консоль

*/
fun encrypt(text: String) {
    var encryptText = text
    var result = ""

    if (encryptText.length % 2 != 0){
        encryptText += " "
    }

    for(word in 0 until encryptText.length step 2) {
        result += encryptText [word + 1]
        result += encryptText [word]
    }

    println(result)
}

fun decrypt(text: String) {
    var encryptText = text
    var result = ""

    for(word in 0 until encryptText.length step 2) {
        result += encryptText [word + 1]
        result += encryptText [word]
    }

    println(result)
}

fun multiplicationTable (x: Int, y: Int) {
    /*
    var xy = x * y
    for (i in 0..x) {
        for (j in 0..y) {
            if (i == 0 && j == 0) {
                print("%${xy.toString().length + 1}s".format(""))
            }
            else if (j == 0) {
                print("%${xy.toString().length + 1}d".format(i))
            }
            else if (i == 0) {
                print("%${xy.toString().length + 1}d".format(j))
            }
            else {
                print("%${xy.toString().length + 1}d".format(i * j))
            }

        }
        println()
    }
    */
    var xy = x * y
    for (i in 0..x) {
        for (j in 0..y) {
            if (i == 0 && j == 0) {
                print("%${xy.toString().length + 1}s".format(""))
            }
            else if (j == 0) {
                print("%${xy.toString().length + 1}d".format(i))
            }
            else if (i == 0) {
                print("%${xy.toString().length + 1}d".format(j))
            }
            else {
                print("%${xy.toString().length + 1}d".format(i * j))
            }

        }
        println()
    }

}