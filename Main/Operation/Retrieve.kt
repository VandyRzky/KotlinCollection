package Main.Operation

// ada 3 jenis: retrieve by possition, by condition, by random

//by position: mengambil element pada collection seuai dengan posisi index
//retrieve by position dapat juga digunakan pada set

//by condition: mengambil element pada collection berdasarkan kondisi

//by random: mengambil element secara random
fun main() {
    val list = listOf("aa", "bb","cc","hi", "hallo", "holla")
    println("retrieve by position")
    println(list.elementAt(1)) // ngambil berdasarkan indeks
    println(list.first()) // ngambil di awal
    println(list.last()) // ngambil di akhir
    println(list.elementAtOrNull(3))
    println(list.elementAtOrElse(10){"kosong"})

    val list2 = (1..20).toList()
    println("retrieve by condition")
    // first dan last dapat error jika tidak ada elemen yang sesuai
    println(list2.first { value -> value>10 })
    println(list2.last { value -> value>10 })
    // akan menghasilkan null jika tidak ada elemen yang sesuai
    println(list2.firstOrNull { value -> value>10 })
    println(list2.lastOrNull { value -> value>10 })
    println(list2.find { value -> value > 15 })
    println(list2.findLast { value -> value > 15 })

    println("retrieve by random")
    println(list2.random())
    println(list2.random())
    println(list2.random())

}