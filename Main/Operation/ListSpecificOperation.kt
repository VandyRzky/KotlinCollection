package Main.Operation

fun main() {
    val list= (1..20).toList()
    println(list.getOrElse(5){value -> "Tidak ada"})
    println(list.getOrElse(20){value -> "Tidak ada"})
    println(list.getOrNull(10))
    println(list.getOrNull(30))
    println(list.subList(0, 5)) // untuk ambil data dari index 0 sampai index sebelum 5
    println(list.binarySearch (10)) // menghasilkan index

    val listString = listOf("a", "b", "b", "c", "d", "d")
    println(listString.indexOf("c")) // mengambil index dari parameter
//mengambil index dari parameter, jika parameter merupakan data yang duplikat maka index yang diambil
// adalah index data terakhir
    println(listString.lastIndexOf("b"))
    println(list.indexOfLast { it > 10 }) // ngambil index yang sesuai dengan lambda
    println(list.indexOfFirst { it < 10 })
}