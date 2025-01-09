package Main

fun main() {
    val map = mapOf(
        1 to "hi",
        2 to "hallo",
        3 to "holla"
    )

    for ((key, value) in map){
        println("$key : $value")
    }
    println(map.forEach{key, value -> println("$key : $value")})
}