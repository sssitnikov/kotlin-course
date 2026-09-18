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
    println("\nЗадание 2. Первый вариант")
    yearOfTheDogConverterDouble(-0.1)
    yearOfTheDogConverterDouble(0.0)
    yearOfTheDogConverterDouble(0.1)
    yearOfTheDogConverterDouble(1.9)
    yearOfTheDogConverterDouble(2.0)
    yearOfTheDogConverterDouble(2.1)

    //второй вариант
    println("\nЗадание 2. Второй вариант")
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
