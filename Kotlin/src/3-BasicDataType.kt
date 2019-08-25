fun main() {
    var normalStr = "Computer Science\nKasetsart University\nBangkhen"
    var rawString1 = """
        Computer Science
        Kasetsart University
        Bangkhen
    """.trimIndent()
    println(normalStr)
    println(rawString1)
    println()

    var rawString2 = """
        Computer Science
        Kasetsart>>>University
        >>>Bangkhen
    """.trimMargin(">>>")
    println(rawString2)
}