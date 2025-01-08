package Main.Operation

// mengecek data pada collection

fun main() {
    val list = (1..20).toList()
    println(list.contains(5))
    // semuanya harus ada pada collection yang ingin dicari
    // jika ada salah satu yang tidak ada maka akan mereturn false
    println(list.containsAll(listOf(1,3,4)))
    println(list.containsAll(listOf(1,3,4, 25)))
    println(list.containsAll(setOf(1,3,4)))
    println(list.isEmpty())
    println(list.isNotEmpty())
}