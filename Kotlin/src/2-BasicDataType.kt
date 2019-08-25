import java.util.*

fun main() {
    var name = "Patiphat"
    var nameCharArray = name.toCharArray();

    for (char in nameCharArray) {
        print(char)
    }
    println()

    nameCharArray.forEach { print(it) }
    println()

    //var arrInt = {1,2,3}   //not support
    var arrInt = arrayOf(1,2,3,5,9)
    var arrayListInt = arrayListOf<Int>(1,2,3,5,9)
    var listInt = listOf<Int>(1,2,3,5,9) // immutable!!!

    var nullArray = arrayOfNulls<Int>(10)

    arrInt.forEach { print(it) }
    println()

    println(Arrays.toString(arrInt))    // Array
    println(arrInt.toList())            // Array -> List
    println(arrayListInt)               // List
    println(listInt)                    // List
    println(Arrays.toString(nullArray)) // Array


}