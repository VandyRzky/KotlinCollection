package Main.Operation


fun main() {
    val map = mapOf(
        1 to "hi",
        2 to "hallo",
        3 to "holla"
    )

    println(map.getValue(1)) // kalo key tidak ada maka akan error
    println(map.getOrElse(5){"Tidak ada"})
    println(map.filter { (key, value) -> value.length > 2 })
    println(map.filterKeys { key -> key != 2 })
    println(map.filterValues { value -> value.length >2 })

}


