import java.util.*

fun getMax(a: Int, b: Int) = if (a>b) a else b
fun temp(a: Int, b: Int) : Int {
    if (a>b)
        return a
    else return b
}

fun getGrade(garde: Int) = when(garde) {
    in 0..49 -> "Grade F"
    in 50..59 -> "Grade D"
    in 60..69 -> "Grade C"
    in 70..79 -> "Grade B"
    in 80..100 -> "Grade A"
    else -> " "
}

fun main() {
    val sc = Scanner(System.`in`)
    var score = sc.nextInt()

    if (score in 0..100) {      // 0 is Valid , 100 is Valid !
        println("Valid")

//        if (score in 0 until 50) {              // 0 is Valid , 50 is InValid
//            println("Grade F")
//        } else if (score in 50..59) {           // 50 is Valid , 59 is Valid
//            println("Grade D")
//        } else if (score in 60 until 70) {      // 60 is Valid , 70 is InValid
//            println("Grade C")
//        } else if (score in 70..79) {
//            println("Grade B")
//        } else if (score in 80..100) {
//            println("Grade A")
//        }

        var grade = if (score in 0 until 50) {
            "Grade F"
        } else if (score in 50..59) {
            println("Orarara Doraemon")
            "Grade D"                           // return Last line of IF
        } else if (score in 60 until 70) {
            "Grade C"
        } else if (score in 70..79) {
            "Grade B"
        } else if (score in 80..100) {
            "Grade A"
        } else {
            " "
        }

        println(grade)
    } else {
        println("Invalid")
    }

//    var isPassed = (score >= 50)? true : false        // Not support
    var isPassed = if (score >= 50) true else false

    println(getMax(30,50))
    println(getGrade(score))
}