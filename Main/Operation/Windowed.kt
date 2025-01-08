package Main.Operation

// operasi untuk mendapatkan semua kemungkinan collection sesuai dengan range yang telah ditentukan


fun main() {
    val list1 = (1..6).toList()
    val list2 = list1.windowed(3, 1,false)
    // jika false maka semua list akan terisi penuh
    val list3 = list1.windowed(3, 1,true)
    val list4 = list1.windowed(3, 1,true, {it.size})
    val list5 = list1.windowed(3, 1,false, {it.size})

    println(list2)
    println(list3)
    println(list4)
    println(list5)

}