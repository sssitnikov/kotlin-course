package lessons.losson07.homeworks

fun main() {

    example1()
    example2()
    example3()
    example4()
    example5()
    example6()
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
}

fun example1() {
    println()
    for (i in 1..5) {
        print(i)
        print(" ")
    }
}

fun example2() {
    println()
    for (i in 1..10) {
        if (i % 2 == 0) {
            print(i)
            print(" ")
        }
    }
}

fun example3() {
    println()
    for (i in 5 downTo 1) {
        print(i)
        print(" ")
    }
}

fun example4() {
    println()
    for (i in 10 downTo 1) {
        print(i - 2)
        print(" ")
    }
}

fun example5() {
    println()
    for (i in 1..9 step 2) {
        print(i)
        print(" ")
    }
}

fun example6() {
    println()
    for (i in 1..20 step 3) {
        print(i)
        print(" ")
    }
}

fun example7(size: Int) {
    println()
    for (i in 3 until size step 2) {
        print(i)
        print(" ")
    }
}

fun example71() {
    println()
    var size = 77
    for (i in 3 until size step 2) {
        print(i)
        print(" ")
    }
}

fun example8() {
    println()
    var i = 1
    while (i <= 5) {
        print(i * i)
        print(" ")
        i++
    }
}

fun example9() {
    println()
    var i = 10
    var j = 5
    while (j <= i) {
        print(i)
        i--
        print(" ")
    }

}

fun example91() {
    println()
    var i = 10
    var j = 5
    var k: Array<Int> = arrayOf()
    while (j <= i) {
        k += i
        i--
    }
    print(k.contentToString())
}

fun example10() {
    println()
    var i = 5
    do {
        print(i)
        print(" ")
        i--
    } while (i >= 1)
}

fun example11() {
    println()
    var i = 5
    do {
        print(i)
        print(" ")
        i++
    } while (i < 10)
}

fun example12() {
    println()
    for (i in 1..10) {
        if (i == 6) break
    }
}

fun example13() {
    println()
    var i = 1
    while (true) {
        if (i == 10) break
        print(i)
        print(" ")
        i++
    }
}

fun example14() {
    println()
    for (i in 1..10) {
        if (i % 2 == 0) continue
        print(i)
        print(" ")
    }
}

fun example15() {
    println()
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
}