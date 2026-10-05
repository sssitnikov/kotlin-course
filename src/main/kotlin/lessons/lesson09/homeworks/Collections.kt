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
    findIndexArray(arrayOf(2, 5, 6, 2))
    findIndexArray(arrayOf(2, 5, 6, 8, null))
    findIndexArray(arrayOf(2, 5, 6, 8, null, 2))
    findIndexArray(arrayOf(2, 5, 6, 8, 44, 2))
    arrayIndexEvenOrOdd(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    findStringInArray(arrayOf("C++", "Java", "Kotlin", "Python"), "Kotlin")
    findStringInArray(arrayOf("C++", "Java", "Kotlin is GREAT LANGUAGE", "Python"), "Kotlin")
    findStringInArray(arrayOf("C++", "Java", "Kotlin", "Python"), "kotlin")
    findStringInArray(arrayOf("C++", "Java", "", "Python"), "Kotlin")
    findStringInArray(arrayOf("C++", "Java", "Kotlin", "Python"), "")
    findStringInArray(arrayOf("C++", "Java", "kotlin", "Python"), "Kotlin")
    findStringInArray(arrayOf("C++", "Java", "KoTlIn", "Python"), "kOtLiN")
    findStringInArray(arrayOf("C++", "Java", "Python"), "Kotlin")
    findStringInArray(arrayOf("C++", "Java", "Kotlin", "Python"), "Kotlin is GREAT LANGUAGE")


    emptyImmutableList()
    immutableStringList()
    mutableIntList()
    addToList(mutableListOf(1, 2, 3, 4, 5))
    addToList(mutableListOf())
    removeFromList(mutableListOf("Hello", "World", "Kotlin"), "World")
    removeFromList(mutableListOf("Hello", "World", "World", "Kotlin"), "World")
    removeFromList(mutableListOf("Hello", "Kotlin"), "World")
    removeFromList(mutableListOf(), "World")
    printListInLoop(listOf(10, 20, 30, 40, 50))
    printListInLoop(listOf())
    getSecondElement(listOf("C++", "Java", "Kotlin", "Python"))
    getSecondElement(listOf("Kotlin"))
    getSecondElement(listOf())
    replaceElement(mutableListOf(1, 2, 3, 4, 5), 2, 100)
    replaceElement(mutableListOf(1, 2, 3, 4, 5), 0, 100)
    replaceElement(mutableListOf(1, 2, 3, 4, 5), 4, 100)
    replaceElement(mutableListOf(1, 2, 3, 4, 5), 5, 100)
    replaceElement(mutableListOf(1, 2, 3, 4, 5), -1, 100)
    replaceElement(mutableListOf(), 2, 100)
    mergeLists(listOf("C++", "Java"), listOf("Kotlin", "Python"))
    mergeLists(listOf("C++", "Java"), listOf())
    mergeLists(listOf(), listOf("Kotlin", "Python"))
    mergeLists(listOf(), listOf())
    findMinMax(listOf(4, 5, 6, 8, 2))
    findMinMax(listOf(-4, -5, -6, -8, -2))
    findMinMax(listOf(7))
    findMinMax(listOf(3, 3, 3))
    findMinMax(listOf())
    findEvenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    findEvenNumbers(listOf(1, 3, 5, 7))
    findEvenNumbers(listOf(2, 4, 6, 8))
    findEvenNumbers(listOf(-4, -3, 0, 3, 4))
    findEvenNumbers(listOf())


    emptyImmutableSet()
    immutableIntSet()
    mutableStringSet()
    addToSet(mutableSetOf("Kotlin", "Java", "Scala"))
    addToSet(mutableSetOf("Kotlin", "Swift", "Go"))
    addToSet(mutableSetOf())
    removeFromSet(mutableSetOf(1, 2, 3, 4, 5), 2)
    removeFromSet(mutableSetOf(1, 3, 4, 5), 2)
    removeFromSet(mutableSetOf(2), 2)
    removeFromSet(mutableSetOf(), 2)
    printSetInLoop(setOf(10, 20, 30, 40, 50))
    printSetInLoop(setOf(1, 1, 2, 2, 3))
    printSetInLoop(setOf())
    containsStringInSet(setOf("C++", "Java", "Kotlin", "Python"), "Kotlin")
    containsStringInSet(setOf("C++", "Java", "Kotlin", "Python"), "kotlin")
    containsStringInSet(setOf("C++", "Java", "Kotlin is GREAT LANGUAGE", "Python"), "Kotlin")
    containsStringInSet(setOf("C++", "Java", "", "Python"), "")
    containsStringInSet(setOf("C++", "Java", "Python"), "")
    containsStringInSet(setOf("C++", "Java", "Python"), "Kotlin")
    containsStringInSet(setOf(), "Kotlin")
    convertSetToMutableList(setOf("C++", "Java", "Kotlin", "Python"))
    convertSetToMutableList(setOf("Kotlin", "Kotlin", "Java"))
    convertSetToMutableList(setOf())
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
    val isFind = false
    while (index < array.size) {
        if (array[index] == 5) {
            println(index)
            break
        }  else {
            index++
        }
    }

    if (!isFind) {
        println(-1)
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
        if (array[i].contains(findString) && array[i].isNotEmpty()) {
            println(array[i])
        }
        //else println("нет совпадений")
    }
}


// Работа со списками List

//Работа со списками List
//1. Создайте пустой неизменяемый список целых чисел.
fun emptyImmutableList() {
    val emptyList = listOf<Int>()
    println(emptyList)
}

//2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
fun immutableStringList() {
    val stringList = listOf("Hello", "World", "Kotlin")
    println(stringList)
}

//3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
fun mutableIntList() {
    val numbersList = mutableListOf(1, 2, 3, 4, 5)
    println(numbersList)
}

//4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
fun addToList(list: MutableList<Int>) {
    list.add(6)
    list.add(7)
    list.add(8)
    println(list)
}

//5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
fun removeFromList(list: MutableList<String>, element: String) {
    val isRemoved = list.remove(element)
    if (!isRemoved) {
        println("элемента \"$element\" нет в списке: $list")
    } else {
        println(list)
    }
}

//6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
fun printListInLoop(list: List<Int>) {
    for (i in list.indices) {
        println(list[i])
    }
}

//7. Создайте список строк и получите из него второй элемент, используя его индекс.
fun getSecondElement(list: List<String>) {
    if (list.size >= 2) {
        println(list[1])
    } else {
        println("в списке меньше двух элементов")
    }
}

//8. Имея изменяемый список чисел, измените значение элемента на определенной позиции
//(например, замените элемент с индексом 2 на новое значение).
fun replaceElement(list: MutableList<Int>, index: Int, newValue: Int) {
    if (index in list.indices) {
        list[index] = newValue
        println(list)
    } else {
        println("индекса $index нет в списке: $list")
    }
}

//9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
//Реши задачу с помощью циклов.
fun mergeLists(list1: List<String>, list2: List<String>) {
    val mergedList = mutableListOf<String>()

    for (i in list1.indices) {
        mergedList.add(list1[i])
    }
    for (i in list2.indices) {
        mergedList.add(list2[i])
    }

    println(mergedList)
}

//10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
fun findMinMax(list: List<Int>) {
    if (list.isEmpty()) {
        println("список пуст")
        return
    }

    var min = list[0]
    var max = list[0]

    for (i in list.indices) {
        if (list[i] < min) {
            min = list[i]
        }
        if (list[i] > max) {
            max = list[i]
        }
    }

    println("min = $min, max = $max")
}

//11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка
//используя цикл.
fun findEvenNumbers(list: List<Int>) {
    val evenList = mutableListOf<Int>()

    for (i in list.indices) {
        if (list[i] % 2 == 0) {
            evenList.add(list[i])
        }
    }

    println(evenList)
}


//Работа с Множествами Set
//1. Создайте пустое неизменяемое множество целых чисел.
fun emptyImmutableSet() {
    val emptySet = setOf<Int>()
    println(emptySet)
}

//2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
fun immutableIntSet() {
    val numbersSet = setOf(1, 2, 3)
    println(numbersSet)
}

//3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями
//(например, "Kotlin", "Java", "Scala").
fun mutableStringSet() {
    val languagesSet = mutableSetOf("Kotlin", "Java", "Scala")
    println(languagesSet)
}

//4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
fun addToSet(set: MutableSet<String>) {
    set.add("Swift")
    set.add("Go")
    println(set)
}

//5. Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
fun removeFromSet(set: MutableSet<Int>, element: Int) {
    val isRemoved = set.remove(element)
    if (!isRemoved) {
        println("элемента $element нет в множестве: $set")
    } else {
        println(set)
    }
}

//6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
fun printSetInLoop(set: Set<Int>) {
    for (element in set) {
        println(element)
    }
}

//7. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве
//указанная строка. Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
fun containsStringInSet(set: Set<String>, findString: String) {
    var isFind = false

    for (element in set) {
        if (element == findString) {
            isFind = true
            break
        }
    }

    println(isFind)
}

//8. Создайте неизменяемое множество строк и конвертируйте его в изменяемый список строк
//с использованием цикла.
fun convertSetToMutableList(set: Set<String>) {
    val mutableList = mutableListOf<String>()

    for (element in set) {
        mutableList.add(element)
    }

    println(mutableList)
}