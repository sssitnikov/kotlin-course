package lessons.lesson10.homeworks

import java.time.LocalDate

fun main() {
    emptyIntMap()
    floatDoubleMap()
    mutableIntStringMap()
    addToMutableMap()
    getValueByKey()
    removeByKey()
    divideKeyByValue()
    changeValue()
    mergeMaps()
    stringToListMap()
    intToMutableSetMap()
    findPairWithFive()
    libraryMap()
    plantsMap()
    quarterFinalMap()
    treatmentMap()
    travelMap()
}

// 1. Пустой неизменяемый словарь Int -> Int
fun emptyIntMap() {
    val map = mapOf<Int, Int>()
    println("1. Пустой словарь: $map")
}

// 2. Словарь Float -> Double
fun floatDoubleMap() {
    val map = mapOf(1.5f to 2.25, 2.0f to 4.0, 3.5f to 12.25)
    println("2. Словарь Float -> Double: $map")
}

// 3. Изменяемый словарь Int -> String
fun mutableIntStringMap() {
    val map = mutableMapOf(1 to "один", 2 to "два")
    println("3. Изменяемый словарь: $map")
}

// 4. Добавление новых пар
fun addToMutableMap() {
    val map = mutableMapOf(1 to "один", 2 to "два")
    map[3] = "три"
    map[4] = "четыре"
    map[5] = "пять"
    println("4. После добавления: $map")
}

// 5. Получение значения по ключу (в том числе по несуществующему)
fun getValueByKey() {
    val map = mutableMapOf(1 to "один", 2 to "два", 3 to "три", 4 to "четыре", 5 to "пять")
    println("5. Значение по ключу 3: ${map[3]}")
    println("5. Значение по ключу 100: ${map[100]}")
    println("5. Значение по ключу 100 со значением по умолчанию: ${map.getOrDefault(100, "нет такого ключа")}")
}

// 6. Удаление элемента по ключу
fun removeByKey() {
    val map = mutableMapOf(1 to "один", 2 to "два", 3 to "три")
    val removed = map.remove(2)
    println("6. Удалили значение '$removed', словарь: $map")
}

// 7. Деление ключа на значение с обработкой деления на 0
fun divideKeyByValue() {
    val map = mapOf(10.0 to 2, 7.5 to 3, 5.0 to 0, -4.0 to 8)
    println("7. Деление ключа на значение:")
    for ((key, value) in map) {
        if (value == 0) {
            println("   $key / $value = бесконечность")
        } else {
            println("   $key / $value = ${key / value}")
        }
    }
}

// 8. Изменение значения существующего ключа
fun changeValue() {
    val map = mutableMapOf(1 to "один", 2 to "два")
    map[1] = "ONE"
    println("8. После изменения значения по ключу 1: $map")
}

// 9. Объединение двух словарей в третьем через циклы
fun mergeMaps() {
    val first = mapOf("a" to 1, "b" to 2)
    val second = mapOf("c" to 3, "a" to 10)
    val result = mutableMapOf<String, Int>()
    for ((key, value) in first) {
        result[key] = value
    }
    for ((key, value) in second) {
        result[key] = value
    }
    println("9. Объединённый словарь: $result")
}

// 10. Словарь String -> List<Int>
fun stringToListMap() {
    val map = mutableMapOf<String, List<Int>>()
    map["чётные"] = listOf(2, 4, 6)
    map["нечётные"] = listOf(1, 3, 5)
    map["простые"] = listOf(2, 3, 5, 7)
    println("10. Словарь списков: $map")
}

// 11. Словарь Int -> MutableSet<String>
fun intToMutableSetMap() {
    val map = mutableMapOf(
        1 to mutableSetOf("яблоко", "груша"),
        2 to mutableSetOf("морковь", "свёкла"),
    )
    val set = map[1]
    set?.add("слива")
    println("11. Множество по ключу 1: $set")
}

// 12. Поиск значения, у которого в паре-ключе есть цифра 5
fun findPairWithFive() {
    val map = mapOf(
        (1 to 2) to "первая",
        (3 to 5) to "вторая",
        (4 to 6) to "третья",
        (5 to 7) to "четвёртая",
    )
    println("12. Значения с 5 в ключе:")
    for ((key, value) in map) {
        if (key.first == 5 || key.second == 5) {
            println("   $key -> $value")
        }
    }
}

// Задачи на подбор оптимального типа для словаря

// 1. Библиотека: автор -> список книг
fun libraryMap() {
    val library: Map<String, List<String>> = mapOf(
        "Лев Толстой" to listOf("Война и мир", "Анна Каренина"),
        "Фёдор Достоевский" to listOf("Идиот", "Бесы"),
    )
    println("Библиотека: $library")
}

// 2. Справочник растений: тип растения -> список названий
fun plantsMap() {
    val plants: Map<String, List<String>> = mapOf(
        "Цветы" to listOf("Роза", "Тюльпан"),
        "Деревья" to listOf("Дуб", "Берёза"),
    )
    println("Растения: $plants")
}

// 3. Четвертьфинал: команда -> список игроков (состав может меняться)
fun quarterFinalMap() {
    val quarterFinal: Map<String, MutableList<String>> = mapOf(
        "Зенит" to mutableListOf("Иванов", "Петров"),
        "Спартак" to mutableListOf("Сидоров", "Смирнов"),
    )
    println("Четвертьфинал: $quarterFinal")
}

// 4. Курс лечения: дата -> список препаратов
fun treatmentMap() {
    val treatment: Map<LocalDate, List<String>> = mapOf(
        LocalDate.of(2026, 10, 12) to listOf("Парацетамол", "Витамин C"),
        LocalDate.of(2026, 10, 13) to listOf("Витамин C"),
    )
    println("Курс лечения: $treatment")
}

// 5. Словарь путешественника: страна -> (город -> список интересных мест)
fun travelMap() {
    val travel: Map<String, Map<String, List<String>>> = mapOf(
        "Россия" to mapOf(
            "Москва" to listOf("Красная площадь", "Третьяковская галерея"),
            "Санкт-Петербург" to listOf("Эрмитаж", "Петергоф"),
        ),
        "Франция" to mapOf(
            "Париж" to listOf("Эйфелева башня", "Лувр"),
        ),
    )
    println("Путешествия: $travel")
}
