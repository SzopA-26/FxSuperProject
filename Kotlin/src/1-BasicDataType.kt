fun main() {
    var intDecimal = 10
    var intHex = 0xF
    var intBin = 0b00001001

    println(intDecimal)
    println(intHex)
    println(intBin)

    var longDecimal = 10L
    var doubleNumber = 1.3123456789
    var floatNumber = 1.3123456789F

    if (longDecimal is Long) {
        println("Yes")
    }

    if (floatNumber is Float) {
        println("Double $doubleNumber")
        println("Float $floatNumber")
    }

    var longData1 = 150000000L
    var longData2 = 150_000_000L

    println(longData1)
    println(longData2)

    var variable = Integer.parseInt("123")

    if (variable is Int) {
        println("variable is Int")
    }

}