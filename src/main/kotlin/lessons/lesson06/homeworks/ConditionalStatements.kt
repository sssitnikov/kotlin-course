package lessons.lesson06.homeworks

fun main() {
    //Тест задания 1
    println("\nЗадание 1")
    determiningTheSeasonThroughWhen(1)
    determiningTheSeasonThroughWhen(3)
    determiningTheSeasonThroughWhen(6)
    determiningTheSeasonThroughWhen(9)
    determiningTheSeasonThroughWhen(11)
    determiningTheSeasonThroughWhen(12)
    determiningTheSeasonThroughWhen(13)
    determiningTheSeasonThroughIf(0) // чудовище)))) Не делайте так!

    //Тест задания 2
    println("\nЗадание 2. Первый вариант с Double")
    yearOfTheDogConverterDouble(-0.1)
    yearOfTheDogConverterDouble(0.0)
    yearOfTheDogConverterDouble(0.1)
    yearOfTheDogConverterDouble(1.9)
    yearOfTheDogConverterDouble(2.0)
    yearOfTheDogConverterDouble(2.1)

    //второй вариант
    println("\nЗадание 2. Второй вариант с Int")
    yearOfTheDogConverterInt(-1)
    yearOfTheDogConverterInt(0)
    yearOfTheDogConverterInt(1)
    yearOfTheDogConverterInt(2)
    yearOfTheDogConverterInt(3)

    //Тест задания 3
    println("\nЗадание 3")
    determinationOfTheMethodOfMovement(-0.1)
    determinationOfTheMethodOfMovement(0.0)
    determinationOfTheMethodOfMovement(0.1)
    determinationOfTheMethodOfMovement(0.9)
    determinationOfTheMethodOfMovement(1.0)
    determinationOfTheMethodOfMovement(1.1)
    determinationOfTheMethodOfMovement(4.9)
    determinationOfTheMethodOfMovement(5.0)
    determinationOfTheMethodOfMovement(5.1)


    //Тест задания 4
    println("\nЗадание 4")
    bonusCalculation(-1.0)
    bonusCalculation(0.0)
    bonusCalculation(0.01)
    bonusCalculation(999.99)
    bonusCalculation(1000.00)
    bonusCalculation(1000.01)
    bonusCalculation(3000.00)

    //Тест задания 5
    println("\nЗадание 5")
    DeterminationTypeDocument("txt")
    DeterminationTypeDocument("jpg")
    DeterminationTypeDocument("xls")
    DeterminationTypeDocument("xsl")

    //Тест задания 6
    println("\nЗадание 6")
    temperatureConverter(0.0, 'W')
    temperatureConverter(0.0, 'F')
    temperatureConverter(0.1, 'F')
    temperatureConverter(0.0, 'C')
    temperatureConverter(0.1, 'C')

    //Тест задания 7
    println("\nЗадание 7")
    chooseClothes(-35.1)
    chooseClothes(-35.0)
    chooseClothes(-34.9)
    chooseClothes(-10.1)
    chooseClothes(-10.0)
    chooseClothes(9.9)
    chooseClothes(10.0)
    chooseClothes(10.1)
    chooseClothes(17.9)
    chooseClothes(18.0)
    chooseClothes(18.1)
    chooseClothes(34.9)
    chooseClothes(35.0)
    chooseClothes(35.1)

    //Тест задания 8
    println("\nЗадание 8")
    chooseMovie(-1)
    chooseMovie(0)
    chooseMovie(1)
    chooseMovie(8)
    chooseMovie(9)
    chooseMovie(10)
    chooseMovie(17)
    chooseMovie(18)
    chooseMovie(19)
}

/*
Задание 1: "Определение сезона"
Напишите функцию, которая на основе номера месяца распечатывает сезон года. Номера месяцев начинаются с единицы.
*/
fun determiningTheSeasonThroughWhen(numberMonth: Int) {
    when (numberMonth) {
        1, 2, 12 -> println("$numberMonth - это зима")
        3, 4, 5 -> println("$numberMonth - это весна")
        6, 7, 8 -> println("$numberMonth - это лето")
        9, 10, 11 -> println("$numberMonth - это осень")
        else -> println("$numberMonth - некорректный месяц")
    }
}

//Не делайте так!
fun determiningTheSeasonThroughIf(numberMonth: Int) {
    val spring = 3..5
    val summer = 6..9
    val autumn = 6..9

    if (numberMonth == 12 || numberMonth in 1..2) {
        println("$numberMonth - это зима")
    } else if (numberMonth in summer) {
        println("$numberMonth - это лето")
    } else if (numberMonth in autumn) {
        println("$numberMonth - это осень")
    } else if (numberMonth in spring) {
        println("$numberMonth - это весна")
    } else {
        println("$numberMonth - некорректный месяц")
    }

}

/*
Задание 2: "Расчет возраста питомца"
Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
Результат распечатай в консоль.
*/

fun yearOfTheDogConverterDouble(ageDog: Double) {
    var convertHumanAge: Double = 0.0

    if (ageDog in 0.1..2.0) {
        convertHumanAge = (ageDog * 10.5)
        println("Если собаке $ageDog годиков - то в человеческих годах $convertHumanAge")
    } else if (ageDog > 2.0) {
        convertHumanAge = (2 * 10.5) + (ageDog - 2) * 4
        println("Если собаке $ageDog годиков - то в человеческих годах $convertHumanAge")
    } else if (ageDog == 0.0) {
        println("Он только родился")
    } else {
        println("Он еще не родился")
    }
}

fun yearOfTheDogConverterInt(ageDog: Int) {
    var convertHumanAge: Double = 0.0

    if (ageDog in 1..2) {
        convertHumanAge = (ageDog * 10.5)
        println("Если собаке $ageDog - то в человеческих годах $convertHumanAge")
    } else if (ageDog > 2) {
        convertHumanAge = (2 * 10.5) + (ageDog - 2) * 4
        println("Если собаке $ageDog - то в человеческих годах $convertHumanAge")
    } else if (ageDog == 0) {
        println("Он только родился")
    } else {
        println("Он еще не родился")
    }
}

/*
Задание 3: "Определение способа перемещения"
Напишите функцию, которая печатает в консоль, какой способ перемещения лучше использовать, исходя из длины маршрута.
Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
*/

fun determinationOfTheMethodOfMovement(distance: Double) {
    if (distance >= 5.0) {
        println("Дистанция = $distance - езжай на автотранспорте")
    } else if (distance >= 1.0) {
        println("Дистанция = $distance - езжай на велосипеде")
    } else if (distance > 0.0) {
        println("Дистанция = $distance - топай пешком")
    } else {
        println("Сидишь на попе ровно!")
    }
}

/*
Задание 4: "Расчет бонусных баллов"
Клиенты интернет-магазина получают бонусные баллы за покупки.
Напишите функцию, которая принимает сумму покупки и печатает в консоль количество бонусных баллов:
2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 3 балла за каждые 100 рублей при сумме свыше этого.
*/

fun bonusCalculation(purchaseAmount: Double) {
    var bonus = 0.0
    if (purchaseAmount < 0) {
        println("Некорректная сумма покупки")
    } else if (purchaseAmount < 1000) {
        bonus = (purchaseAmount / 100 + purchaseAmount % 100) * 2
        println(String.format("Начислено бонусов: %.2f", bonus))
    } else {
        bonus = (purchaseAmount / 100 + purchaseAmount % 100) * 3
        println(String.format("Начислено бонусов: %.2f", bonus))
    }
}

/*
Задание 5: "Определение типа документа"
В системе хранения документов каждый файл имеет расширение.
Напишите функцию, которая на основе расширения файла печатает в консоль его тип:
"Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
*/

fun DeterminationTypeDocument(typeFormat: String) {
    when (typeFormat) {
        "txt", "doc", "docx" -> println("$typeFormat - это Текстовый документ")
        "jpeg", "jpg", "png", "heic" -> println("$typeFormat - Изображение")
        "xls", "xlsx" -> println("$typeFormat - Таблица")
        else -> println("$typeFormat - Неизвестный тип")
    }
}

/*
Задание 6: "Конвертация температуры"
Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и
наоборот в зависимости от указанной единицы измерения (C/F).
Единицу измерения нужно передать вторым аргументом функции.
Несколько аргументов передаются через запятую.
Распечатай в консоль результат конвертации с добавлением единицы измерения.
Чтобы добавить единицу измерения после результата используй функцию печати без переноса строки print("C") или print("F").
*/

fun temperatureConverter(temperature: Double, typeTemperature: Char) {
    var convertCToF = ((temperature * (9 / 5)) + (temperature * (9 % 5))) + 32
    var convertFToC = ((temperature - 32) * (5 / 9)) + ((temperature - 32) * (5 % 9))
    when (typeTemperature) {
        //не вижу смысла изобретать велосипед
        'C' -> println("$convertFToC $typeTemperature")
        'F' -> println("$convertCToF $typeTemperature")
        else -> println("Некорректный тип данных")
    }
}

/*
Задание 7: "Подбор одежды по погоде"
Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды:
"куртка и шапка" при температуре ниже +10,
"ветровка" от +10 до +18 градусов включительно и
"футболка и шорты" при температуре выше +18 градусов.
При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
*/

fun chooseClothes(temperature: Double) {
    if (temperature < -30.0 || temperature > 35.0) {
        println("$temperature - Рекомендую не выходить из дома")
    } else if (temperature < 10.0) {
        println("$temperature - куртка и шапка")
    } else if (temperature > 18.0) {
        println("$temperature - футболка и шорты")
    } else {
        println("$temperature - ветровка")
    }

    /*
    через when
            when {
            (temperature < -30.0 || temperature > 35.0) -> {
                println("$temperature - Рекомендую не выходить из дома")
            }
            (temperature < 10.0) -> {
                println("$temperature - куртка и шапка")
            }
            (temperature > 18.0) -> {
                println("$temperature - футболка и шорты")
            }
            else -> {
                println("$temperature - футболка и шорты")
            }
        }*/
}

/*
Задание 8: "Выбор фильма по возрасту"
Кинотеатр предлагает фильмы разных возрастных категорий.
Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов:
"детские" (от 0 до 9),
"подростковые" (от 10 до 18),
"18+" для остальных.
*/

fun chooseMovie(age: Int) {
    var intRangeChildren = 0..9
    var intRangeTeen = 10 until 18
    when {
        age < 0 -> {
            println("таких фильмов не бывает")
        }

        (age in intRangeChildren) -> {
            println("детские")
        }

        (age in intRangeTeen) -> {
            println("подростковые")
        }

        else -> {
            println("18+")
        }
    }

    /*    if (age < 0) {
            println("таких фильмов не бывает")
        }
        else if (age in intRangeChildren) {
            println("детские")
        } else if (age in intRangeTeen) {
            println("подростковые")
        } else {
            println("18+")
        }*/

}