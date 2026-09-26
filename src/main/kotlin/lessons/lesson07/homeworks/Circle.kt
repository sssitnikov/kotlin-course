package lessons.lesson07.homeworks

fun main() {

    example1()
    example2()
    example3()
    example4()
    example5()
    example6()
    example7(2)
    example7(100)
    example71()
    example8()
    example9()
    example91()
    example10()
    example11()
    example12()
    example13()
    example14()
    example15()
    example16()
    //Задача повышенной сложности (разбирается отдельно от основной домашки и награждается отдельным стимом за разбор).
    // Её выполнять по желанию, проверка не выполняется.
    example17(0)
    example17(10)
    example18(5)
    example18(0)
    example19(10)
    example19(0)
    example20()
    example21(10)
    example21(0)
}

fun example1() {
    println("Напишите цикл for, который выводит числа от 1 до 5.")
    for (i in 1..5) {
        print(i)
        print(" ")
    }
    println()
}

fun example2() {
    println("Напишите цикл for, который выводит четные числа от 1 до 10.")
    for (i in 1..10) {
        if (i % 2 == 0) {
            print(i)
            print(" ")
        }
    }
    println()
}

fun example3() {
    println("Создайте цикл for, который выводит числа от 5 до 1.")
    for (i in 5 downTo 1) {
        print(i)
        print(" ")
    }
    println()
}

fun example4() {
    println("Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.")
    for (i in 10 downTo 1) {
        print(i - 2)
        print(" ")
    }
    println()
}

fun example5() {
    println("Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.")
    for (i in 1..9 step 2) {
        print(i)
        print(" ")
    }
    println()
}

fun example6() {
    println("Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.")
    for (i in 1..20 step 3) {
        print(i)
        print(" ")
    }
    println()
}

fun example7(size: Int) {
    println("Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.")
    if (size < 3) {
        println("Некорректное число")
    } else {
        for (i in 3 until size step 2) {
            print(i)
            print(" ")
        }
    }
    println()
}

fun example71() {
    println("Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.")
    var size = 77
    for (i in 3 until size step 2) {
        print(i)
        print(" ")
    }
    println()
}

fun example8() {
    println("Создайте цикл while, который выводит квадраты чисел от 1 до 5")
    var i = 1
    while (i <= 5) {
        print(i * i)
        print(" ")
        i++
    }
    println()
}

fun example9() {
    println("Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль")
    var i = 10
    var j = 5
    while (j <= i) {
        print(i)
        i--
        print(" ")
    }
    println()
}

fun example91() {
    println("Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль")
    var i = 10
    var j = 5
    var k: Array<Int> = arrayOf()
    while (j <= i) {
        k += i
        i--
    }
    print(k.contentToString())
    println()
}

fun example10() {
    println("Используйте цикл do while, чтобы вывести числа от 5 до 1.")
    var i = 5
    do {
        print(i)
        print(" ")
        i--
    } while (i >= 1)
    println()
}

fun example11() {
    println("Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.")
    var i = 5
    do {
        print(i)
        print(" ")
        i++
    } while (i < 10)
    println()
}

fun example12() {
    println("Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.")
    for (i in 1..10) {
        if (i == 6) break
    }
    println()
}

fun example13() {
    println("Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.")
    var i = 1
    while (true) {
        if (i == 10) break
        print(i)
        print(" ")
        i++
    }
    println()
}

fun example14() {
    println("В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.")
    for (i in 1..10) {
        if (i % 2 == 0) continue
        print(i)
        print(" ")
    }
    println()
}

fun example15() {
    println("Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.")
    var i = 1
    while (i <= 10) {
        if (i % 3 == 0) {
            i++ //попал в засаду без инкремента
            continue
        }
        print(i)
        print(" ")
        i++
    }
    println()
}

fun example16() {
    println()
    println("Используя вложенный цикл реализовать таблицу умножения, как на картинке.")
    for (i in 1..10) {
        for (j in 1..10) {
            print(i * j)
            print(" ")
        }
        println()
    }
    println()
}

fun example17(arg: Int) {
    println("Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.")
    var sum = 0
    if (arg < 1) {
        println("Некорректно переданное значение")
    }
    else {
        for (i in 1..arg) {
            sum += i
        }
        println(sum)
    }
    println()
}

fun example18(arg: Int) {
    println("Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.")
    var count = 1
    var factorial = 1
    if (arg < 1) {
        println("Некорректно переданное значение")
    } else {
        while (count <= arg) {
            factorial *= count
            count++
        }
        println(factorial)
    }
    println()
}

fun example19(arg: Int) {
    println("Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.")
    var sum = 0
    var i = 2
    if (arg < 2) {
        println("Некорректно переданное значение")
    } else {
        while (i <= arg) {
            if (i % 2 == 0) {
                sum += i
            }
            i++
        }
        println(sum)
    }
    println()
}

fun example20() {
    println("Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.")
    var i = 1
    var j = 1
    while (i <= 3) {
        while (j <= 5) {
            print("*")
            j++
        }
        println()
        j = 1
        i++
    }
    println()
}

fun example21(arg: Int) {
    println("Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.")
    var sumOfEvenNumbers = 0
    var sumOfOddNumbers = 0
    if (arg < 1) {
        println("Некорректно переданное значение")
    } else {
        for (i in 1..arg) {
            if (i % 2 == 0) {
                sumOfEvenNumbers += i
            } else sumOfOddNumbers += i
        }
        println("Сумма четных чисел = $sumOfEvenNumbers")
        println("Сумма нечетных чисел = $sumOfOddNumbers")
    }
    println()
}