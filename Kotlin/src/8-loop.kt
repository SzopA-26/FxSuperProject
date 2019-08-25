import java.util.*

fun main() {
    var sc = Scanner(System.`in`)
    var listDays = listOf("Sunday","Monday"
        ,"Tuesday","Wednesday","Thursday"
        ,"Friday","Saturday")

    println("Today is ${listDays[0]}")
    print("First sunday of this month: " )
    val firstSunday = sc.nextInt()
    print("Month: ")
    val month = readLine()
    print("Year: ")
    val year = sc.nextInt()

    var currentDay = firstSunday
    for (day in listDays) {
        println("$day, $month $currentDay, $year")
        currentDay++
    }

    for (index in listDays.indices) {
        println("${listDays[index]}, $month ${firstSunday+index} $year")
    }


}