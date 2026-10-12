package lessons.lesson11.homeworks

fun main() {
    // Задачи на сигнатуру метода
    doNothing()
    println("2. Сумма 3 и 5: ${sum(3, 5)}")
    printText("Привет, Kotlin!")
    println("4. Среднее значение [1, 2, 3, 4]: ${average(listOf(1, 2, 3, 4))}")
    println("5. Длина \"Kotlin\": ${nullableLength("Kotlin")}, длина null: ${nullableLength(null)}")
    println("6. Nullable вещественное число: ${getNullableDouble()}")
    handleNullableList(listOf(1, 2, 3))
    handleNullableList(null)
    println("8. Число 7 строкой: ${intToNullableString(7)}, число -1 строкой: ${intToNullableString(-1)}")
    println("9. Список nullable строк: ${getNullableStrings()}")
    println("10. \"abc\" и 3: ${checkNullable("abc", 3)}, null и 3: ${checkNullable(null, 3)}")

    // Задачи на написание кода
    println("11. 21 * 2 = ${multiplyByTwo(21)}")
    println("12. 4 чётное: ${isEven(4)}, 7 чётное: ${isEven(7)}")

    println("13. Числа до 5:")
    printNumbersUntil(5)
    println("13. Числа до 0:")
    printNumbersUntil(0)

    println("14. Первое отрицательное в [3, 8, -2, -7]: ${findFirstNegative(listOf(3, 8, -2, -7))}")
    println("14. Первое отрицательное в [1, 2, 3]: ${findFirstNegative(listOf(1, 2, 3))}")

    println("15. Обработка списка [один, два, null, три]:")
    processList(listOf("один", "два", null, "три"))
}

// Задачи на сигнатуру метода

// 1. Не принимает аргументов и не возвращает значения
public fun doNothing() {
    println("1. Функция без аргументов и без возвращаемого значения")
    return
}

// 2. Принимает два целых числа и возвращает их сумму
public fun sum(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает строку и ничего не возвращает
public fun printText(text: String) {
    println("3. Переданная строка: $text")
    return
}

// 4. Принимает список целых чисел и возвращает среднее значение типа Double
public fun average(numbers: List<Int>): Double {
    if (numbers.isEmpty()) return 0.0
    return numbers.sum().toDouble() / numbers.size
}

// 5. Принимает nullable строку, возвращает её длину как nullable Int, доступна только в текущем файле
private fun nullableLength(text: String?): Int? {
    return text?.length
}

// 6. Не принимает аргументов и возвращает nullable вещественное число
public fun getNullableDouble(): Double? {
    return 3.14
}

// 7. Принимает nullable список целых чисел, не возвращает значения, доступна только в текущем файле
private fun handleNullableList(numbers: List<Int>?) {
    if (numbers == null) {
        println("7. Список равен null")
        return
    }
    println("7. Переданный список: $numbers")
    return
}

// 8. Принимает целое число и возвращает nullable строку
public fun intToNullableString(number: Int): String? {
    if (number < 0) return null
    return number.toString()
}

// 9. Не принимает аргументов и возвращает список nullable строк
public fun getNullableStrings(): List<String?> {
    return listOf("a", null, "b")
}

// 10. Принимает nullable строку и nullable целое число, возвращает nullable булево значение
public fun checkNullable(text: String?, number: Int?): Boolean? {
    if (text == null || number == null) return null
    return text.length == number
}

// Задачи на написание кода

// 11. Умножает число на 211ё
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

// 12. Проверяет, является ли число чётным
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// 13. Выводит числа от 1 до n, при n < 1 сразу завершается
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
    return
}

// 14. Возвращает первое отрицательное число или null, если его нет
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) return number
    }
    return null
}

// 15. Выводит строки списка, при встрече null прекращает выполнение
fun processList(strings: List<String?>) {
    for (string in strings) {
        if (string == null) return
        println(string)
    }
    return
}
