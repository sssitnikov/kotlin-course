package lessons.lesson09.homeworks

import kotlin.Int
import kotlin.String
import kotlin.arrayOfNulls
import kotlin.collections.contentToString

fun main() {
    arrayFiveInt()
    emptyArray()
    arrayFiveDoubleIndex()
    arrayFiveIntIndex()
    arrayNullableString()
    emptyCopyArray()
    subtractionFromArray()
    findIndexArray(arrayOf(2, 5, 6, 2))
    findIndexArray(arrayOf(2, 5, 6, 8, null))
    findIndexArray(arrayOf(2, 5, 6, 8, null, 2))
    findIndexArray(arrayOf(2, 5, 6, 8, 44, 2))
    arrayIndexEvenOrOdd(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    findStringInArray(arrayOf("C++", "Java", "Kotlin", "Python"), "Kotlin")
    findStringInArray(arrayOf("C++", "Java", "Kotlin is GREAT LANGUAGE", "Python"), "Kotlin")
    findStringInArray(arrayOf("C++", "Java", "Kotlin", "Python"), "kotlin")
    findStringInArray(arrayOf("C++", "Java", "kotlin", "Python"), "Kotlin")
    findStringInArray(arrayOf("C++", "Java", "KoTlIn", "Python"), "kOtLiN")
    findStringInArray(arrayOf("C++", "Java", "Python"), "Kotlin")
    findStringInArray(arrayOf("C++", "Java", "Kotlin", "Python"), "Kotlin is GREAT LANGUAGE")
}


//Работа с массивами Array
//1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
fun arrayFiveInt() {
    val numbersArray = arrayOf(1, 2, 3, 4, 5)
    println(numbersArray.contentToString())
}

//2. Создайте пустой массив строк размером 10 элементов.
fun emptyArray() {
    val emptyArray = Array<String>(10) { "" }
    println(emptyArray.contentToString())
}

//3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
fun arrayFiveDoubleIndex() {
    val numbersArray = Array<Double>(5) { i -> i * 2.0 }
    println(numbersArray.contentToString())
}

//4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение,
//равное его индексу, умноженному на 3.
fun arrayFiveIntIndex() {
    //val numbersArray1 = Array<Int>(5) {i -> i * 3}

    val numbersArray2 = arrayOfNulls<Int>(5)
    for (i in numbersArray2.indices) {
        numbersArray2[i] = i * 3
    }
    println(numbersArray2.contentToString())
}

//5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
fun arrayNullableString() {
    val arrayNullableString = arrayOf<String?>(null, "Java", "Kotlin")
    println(arrayNullableString.contentToString())
}

//6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
fun emptyCopyArray() {
    val array = arrayOf<Int>(4, 5, 6, 8, 2)
    val emptyArray = Array<Int?>(array.size) { null }

    for (i in array.indices) {
        emptyArray[i] = array[i]
    }

    //println(array.contentToString())
    println(emptyArray.contentToString())
}

//7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив,
//вычев значения одного из другого. Распечатайте полученные значения.

fun subtractionFromArray() {
    val array1 = arrayOf<Int>(4, 5, 6, 8, 2)
    val array2 = arrayOf<Int>(65, 34, 123, 5, 1)
    val array3 = Array<Any?>(5) { null }

    for (i in array1.indices) {
        array3[i] = array1[i] - array2[i]
    }

    println(array3.contentToString())
}

//8. Создайте массив целых чисел. Найдите индекс элемента со значением 5.
//Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.

fun findIndexArray(array: Array<Int?>) {
    var index = 0
    while (index < array.size) {
        if (array.size < 5 || array[4] == null) {
            println(-1)
            break
        } else if (index == 4) {
            println(array[index])
            break
        } else {
            index++
        }
    }
}

//9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
//Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

fun arrayIndexEvenOrOdd(array: Array<Int>) {
    for (i in array.indices) {
        if (array[i] % 2 != 0) {
            println("$i - четное")
        } else println("$i - нечетное")
    }
}


//10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
//в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.

fun findStringInArray(array: Array<String>, findString: String) {
    for (i in array.indices) {
        if (array[i].contains(findString, ignoreCase = true)) {
            println(array[i])
        }
        //else println("нет совпадений")
    }
}