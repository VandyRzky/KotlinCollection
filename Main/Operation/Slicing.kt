package Main.Operation

// untuk mengambil sebbagian elemen yang ada pada collection berdasarkan range
// parameter pada slice merupakan index

fun main() {
    val list1 = (0..20).toList()
    val list2 = list1.slice(0..10) // yang diambil index ke 0 hingga 10
    val list3 = list1.slice(0..20 step 3)
    val list4 = list1.slice(20 downTo 0 step 3)

    val list5 = listOf("a", "b", "c", "d", "e", "f", "aa", "bb","cc", "dd")
    val list6 = list5.slice(0..(list5.size - 1))
    val list7 = list5.slice(0..(list5.size - 1) step 2)

    println(list2)
    println(list3)
    println(list4)
    println(list6)
    println(list7)
}