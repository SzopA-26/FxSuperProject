fun main() {
    var score = 79
    var grade = when(score) {
        in 0..49 -> "Grade F"
        in 50..59 -> "Grade D"
        in 60..69 -> "Grade C"
        in 70..79 -> "Grade B"
        in 80..100 -> "Grade A"
        else -> " "
    }
    println(grade)
}