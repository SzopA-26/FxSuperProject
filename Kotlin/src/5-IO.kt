import java.util.*

fun main() {
    print("Hello")
    println("Thursday, August 22")              //sout
    System.out.printf("Hello %s\n", "CNC X")
    println("Hello %s".format("CNC X"))

    var input = readLine()

    val sc = Scanner(System.`in`)
    println(sc.nextInt() + 10)
    if (input is String) {
        println("Yes")
    }

}