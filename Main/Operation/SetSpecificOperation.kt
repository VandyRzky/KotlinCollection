package Main.Operation

fun main() {
    val set1 = setOf("a", "b", "c")
    val set2 = setOf("b", "c", "d")


    println(set1 union set2) // menggabungkan set dengan collection
    println(set1 intersect  set2) // ngambil data yang ada di kedua variabel
    println(set1 subtract  set2) // ngambil data yang hanya ada di variabel pertama (set1)
    // operasi tersebut akan selalu menghasilkan set
}