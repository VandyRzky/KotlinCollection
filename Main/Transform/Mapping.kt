package Main.Transform

// mengubah data ke data lain
// butuh lambda sebagai parameter



fun main() {
    val list1 = listOf("joko", "budi", "hi", "hallo")
    val list2: List<String> = list1.map { value -> value.toUpperCase() }
    val list3: List<Int> = list2.map{value2 -> value2.length}
    val list4: List<String> = list1.mapIndexed{ index, values ->
        if (index % 2 == 0)  "$values genap"
        else "$values ganjil"

    }
    println(list2)
    println(list3)
    println(list4)

    val number = (1..20).toList()
    val numberGanjil = number.mapNotNull { value ->
        if (value%2 == 1) value
        else null
    }
    println(numberGanjil)


//    mapping pada map
    val map1 = mapOf(
        1 to "hi",
        2 to "halo",
        3 to "holla"
    )
    val map2 = map1.mapKeys { value -> value.key + 10 }
    val map3 =  map1.mapValues { value -> value.value.toUpperCase() }

    println(map2)
    println(map3)


}