package Main.Transform

// operasi yang akan menghasilkan map

fun main() {
    val list1 = listOf("hi", "hallo", "holla")
    val list2 = listOf(1,2,3)
    val map1 = list1.associate { Pair(it, it.length) }
    val map2 = list1.associateBy {it.length}
    val map3 = list1.associateWith { it.length }
    
    println(map1)
    println(map2)
    println(map3)
}