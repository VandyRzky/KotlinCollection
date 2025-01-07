package Main.Operators

// tidak akan mengubah collection aslinya tetapi membuat collection baru

fun main() {
    val list1 = listOf("hi", "hallo")
    val list2: List<Any> = listOf(1, 2, "holla")
    val list3 = list1.plus(list2) // dapat juga list1 + list2
    val list4 =  list2 + "bye" // list2.plus("bye")
    val list5 = list2.minus(listOf(1,2))
    val list6 = list2 - 2

    println(list3)
    println(list4)
    println(list5)
    println(list6)

    //plus minus operators pada map
    val map1 = mapOf(
        1 to "a",
        2 to "b"
    )
    val map2 = map1 + mapOf(
        3 to "c"
    )
    val map3 = map1 - 2 // pada map minus hanya perlu memanggil key
    println(map2)
    println(map3)

}