fun main() {
    var arrInt = arrayListOf(1,5,3,8,43)

    println(arrInt)
    var arrIntx2 = arrInt.forEach { println(it*2) }
    //onEach return element
    //forEach return void (kotlin.Unit)

    println(arrIntx2)
}