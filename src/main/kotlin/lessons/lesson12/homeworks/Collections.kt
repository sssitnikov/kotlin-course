package lessons.lesson12.homeworks

fun main() {
    val numbers = listOf(4, 25, 18, 7, 30, 12, 9, 42, 6, 19)
    val words = listOf("яблоко", "банан", "арбуз", "вишня", "апельсин", "банан", "груша")
    val nullableWords = listOf("кот", null, "собака", null, "попугай")

    // Задачи на приведение коллекции к значению
    println("1. Размер больше 5: ${numbers.size > 5}")
    println("2. Коллекция пустая: ${numbers.isEmpty()}")
    println("3. Коллекция не пустая: ${numbers.isNotEmpty()}")
    println("4. Элемент по индексу 20 или значение по умолчанию: ${numbers.getOrElse(20) { -1 }}")
    println("5. Коллекция строкой: ${numbers.joinToString(separator = " | ")}")
    println("6. Сумма: ${numbers.sum()}")
    println("7. Среднее: ${numbers.average()}")
    println("8. Максимальное: ${numbers.maxOrNull()}")
    println("9. Минимальное: ${numbers.minOrNull()}")
    println("10. Первое число или null: ${numbers.firstOrNull()}")
    println("11. Содержит 42: ${numbers.contains(42)}")

    // Задачи на обработку коллекций
    println("12. В диапазоне 18-30: ${numbers.filter { it in 18..30 }}")
    println("13. Не делятся на 2 и 3 одновременно: ${numbers.filterNot { it % 2 == 0 && it % 3 == 0 }}")
    println("14. Без null: ${nullableWords.filterNotNull()}")
    println("15. Длины слов: ${words.map { it.length }}")
    println("16. Перевёрнутые слова и длины: ${words.associate { it.reversed() to it.length }}")
    println("17. По алфавиту: ${words.sorted()}")
    println("18. Первые 3: ${words.take(3)}")
    println("19. Квадраты элементов:")
    numbers.forEach { println("   $it^2 = ${it * it}") }
    println("20. По первой букве: ${words.groupBy { it.first() }}")
    println("21. Без дублей: ${words.distinct()}")
    println("22. По убыванию: ${numbers.sortedDescending()}")
    println("23. Последние 3: ${words.takeLast(3)}")

    // Задача 24
    println("24. Характеристика коллекций:")
    println(describeCollection(emptyList()))
    println(describeCollection(listOf(1, 2)))
    println(describeCollection(listOf(0, 1, 2, 3, 4)))
    println(describeCollection(listOf(5000, 5000, 1, 1, 1)))
    println(describeCollection(listOf(5, 10, 15, 10, 10)))
    println(describeCollection(listOf(11, 22, 33, 44, 5, 6)))
    println(describeCollection(listOf(-20, -30, -40, -50, -60)))
    println(describeCollection(listOf(1001, 1002, 1003, 1004, 1005)))
    println(describeCollection(listOf(3, 14, 15, 92, 65)))
    println(describeCollection(listOf(1, 2, 3, 4, 5)))

    // Задача 25
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println("25. Три худшие удовлетворительные оценки: ${analyzeGrades(grades)}")

    // Задачи 26 и 27
    val items = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик",
        "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска",
        "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба",
        "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
        "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    println("26. Каталог по первой букве:")
    createCatalog(items).forEach { (letter, group) -> println("$letter: $group") }
    println("27. Средняя длина слов: ${averageWordLength(items)}")

    // Задача 28
    val numbersToCategorize = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println("28. Категории чисел: ${categorizeNumbers(numbersToCategorize)}")

    // Задача 29
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println("29. Первый возраст больше 18: ${findFirstOlder(ages, 18)}")
    println("29. Первый возраст больше 100: ${findFirstOlder(ages, 100)}")
}

// Задача 24. Характеристика числовой коллекции
fun describeCollection(collection: List<Int>): String {
    return when {
        collection.isEmpty() -> "Пусто"
        collection.size < 5 -> "Короткая"
        collection.first() == 0 -> "Стартовая"
        collection.sum() > 10000 -> "Массивная"
        collection.average() == 10.0 -> "Сбалансированная"
        collection.joinToString().length == 20 -> "Клейкая"
        (collection.maxOrNull() ?: 0) < -10 -> "Отрицательная"
        (collection.minOrNull() ?: 0) > 1000 -> "Положительная"
        collection.contains(3) && collection.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

// Задача 25. Анализ учебных оценок
fun analyzeGrades(grades: List<Int>): List<Int> {
    return grades
        .filter { it >= 60 }
        .sorted()
        .take(3)
}

// Задача 26. Создание каталога по первой букве
fun createCatalog(items: List<String>): Map<Char, List<String>> {
    return items
        .map { it.lowercase() }
        .groupBy { it.first() }
}

// Задача 27. Подсчёт средней длины слов в списке
fun averageWordLength(words: List<String>): String {
    val average = words
        .map { it.length }
        .average()
    return "%.2f".format(average)
}

// Задача 28. Категоризация чисел
fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
    return numbers
        .distinct()
        .sortedDescending()
        .groupBy { if (it % 2 == 0) "четные" else "нечетные" }
}

// Задача 29. Поиск первого подходящего элемента
fun findFirstOlder(ages: List<Int?>, age: Int): Int? {
    return ages
        .filterNotNull()
        .firstOrNull { it > age }
}
