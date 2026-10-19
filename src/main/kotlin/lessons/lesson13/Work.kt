package lessons.lesson13

val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

val food = mapOf(
    "Овощи" to listOf("Картофель", "Морковь", "Лук"),
    "Фрукты" to listOf("Яблоки", "Груши", "Апельсины"),
    "Ягоды" to listOf("Виноград", "Клубника", "Голубика"),
    "Орехи" to listOf("Арахис", "Фундук", "Макадамия"),
    "Зелень" to listOf(),
)

fun main() {
    entries()
    gettingElements()
    changingMap()
    checking()
    filtering()
    transformation()
    iteration()
    size()
    practice()
}

// Работа с Map.Entry
fun entries() {
    println("=== Map.Entry ===")
    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }
    // деструктуризация: ключ и значение сразу раскладываются в две переменные
    for ((key, value) in fruitsPrices) {
        println("Key: $key, Value: $value")
    }
}

// Получение элементов
fun gettingElements() {
    println("=== entries / keys / values ===")
    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values
    println(entries)
    println(keys)
    println(values)

    println("=== getOrElse / getValue / getOrDefault ===")
    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { 9999.99 }
    println(priceOfPearOrElse)
    val priceOfApple = fruitsPrices.getValue("apple") // если ключа нет - будет исключение NoSuchElementException
    println(priceOfApple)
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)
    println(priceOfPearOrDefault)
}

// Изменение состава словаря
fun changingMap() {
    println("=== Изменение состава словаря ===")
    val fruitsWithoutBanana = fruitsPrices - "banana" // создание нового словаря в котором нет "banana"
    println(fruitsWithoutBanana)
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5) // создание нового словаря с дополнительной парой
    println(fruitsWithPineapple)

    val mutableFruits = fruitsPrices.toMutableMap() // Создание нового изменяемого словаря с теми же значениями
    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9)) // Добавление словаря
    println(mutableFruits)

    // Не добавляет данные в существующий словарь а создаёт новый, в который включены данные из обоих словарей
    val combined = mutableFruits + mapOf("mango" to 4.2)
    println(combined.containsKey("mango"))
    println(mutableFruits.containsKey("mango"))

    mutableFruits.remove("apple") // Удаление элемента
    println(mutableFruits)
    mutableFruits.clear() // Очистка словаря
    println(mutableFruits)
}

// Проверка наличия элементов
fun checking() {
    println("=== containsKey / containsValue / isEmpty / isNotEmpty / all / any ===")
    val containsApple = fruitsPrices.containsKey("apple")
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty()
    val isNotEmpty = fruitsPrices.isNotEmpty()
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 }
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }
    println(containsApple)
    println(containsValue1_5)
    println(isEmpty)
    println(isNotEmpty)
    println(areAllFruitsExpensive)
    println(isAnyFruitCheap)
}

// Фильтрация
fun filtering() {
    println("=== filter / filterKeys / filterValues / filterNot / count ===")
    val filteredByPrice = fruitsPrices.filter { it.value > 2.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }
    println(filteredByPrice)
    println(filteredByKeys)
    println(filteredByValues)
    println(filteredNotApple)
    println(countExpensiveFruits)
}

// Преобразование
fun transformation() {
    println("=== mapValues / mapKeys / map ===")
    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" } // map у словаря возвращает список
    println(increasedPrices)
    println(fruitNamesUppercase)
    println(fruitsList)

    println("=== toMap / toMutableMap ===")
    val mutableFruitsPrices = mutableMapOf("apple" to 2.99, "banana" to 1.99)
    val toMap = mutableFruitsPrices.toMap() // неизменяемая копия
    val toMutableMap = fruitsPrices.toMutableMap() // изменяемая копия
    println(toMap)
    println(toMutableMap)
}

// Итерация с forEach
fun iteration() {
    println("=== forEach ===")
    // С использованием деструктуризации
    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }
    // С использованием it как объекта Map.Entry
    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")
    }
}

// Размер словаря
fun size() {
    println("=== size / count ===")
    println(fruitsPrices.size) // количество ключей
    println(fruitsPrices.count()) // тоже количество ключей
    println(fruitsPrices.count { it.value > 2 }) // количество ключей, подходящих под условие
}

// Практика на словаре продуктов
fun practice() {
    println("=== Практика: словарь продуктов ===")
    println(food.keys)
    println(food.getValue("Ягоды"))
    println(food.getOrDefault("Грибы", listOf("нет в наличии")))
    println(food.filterValues { it.isEmpty() }.keys)
    println(food.filterValues { it.isNotEmpty() }.size)
    println(food.mapValues { it.value.size })
    println(food.values.flatten().filter { it.startsWith("Г") })
    println(food.any { "Лук" in it.value })
    food.forEach { (category, products) ->
        val list = if (products.isEmpty()) "пусто" else products.joinToString()
        println("$category: $list")
    }
}
