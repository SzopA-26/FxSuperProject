fun main() {
//    var name : String = null // var cannot be null
    var name : String? = null // String ???
    var name2 : String = "Hello"
//    var name3 = name as String // Not recommend

//    println(name.toUpperCase())
    println(name?.toUpperCase())  // null ???
    println(name!!.toUpperCase()) // String confirm (ERROR) Not recommend
    println(name2.toUpperCase())



}