package Main.Transform

// mengubah collection menjadi string

fun main() {
    val list = listOf("hi", "holla", "hallo")
    println(list.joinToString(", ", "|", "|"))
    println(list.joinToString(", ", "|", "|"){ value -> "kata $value" })//lamda
// berfungsi sebagai pengubah

    val builder = StringBuilder() // tempat nyimpan
    list.joinTo(builder, " ", "|", "|")
    list.joinTo(builder, ", ", "<", ">")
    val hasil = builder.toString()
    println(hasil)
}