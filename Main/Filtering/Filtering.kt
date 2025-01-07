package Main.Filtering

// melakukan filter

fun main() {
    val list1 = listOf("hi", "hallo", "holla")
    val list2 = list1.filter { value -> value.length > 2 } // yang menghasilkan true akan disimpan
    val list3 = list1.filterIndexed{index, value -> index % 2 == 0} // mengambil index dan value

    val list4: List<Any?> = listOf(null, 1, "halo")
    val list5 = list4.filterNotNull() // hapus yang null
    val list6 = list4.filterIsInstance<String>() // untuk mengambil tipe data tertentu

    println(list2)
    println(list3)
    println(list5)
    println(list6)
}