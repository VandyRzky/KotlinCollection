package Main

//operasi untuk menggabungkan 2 buah collection

fun main() {
    val list = listOf(1, 2, 3, 4)
    val list2 = listOf(9, 8, 7, 6, 5) // 5 tidak masuk pair karena tidak memiliki pasangan
    val list3: List<Pair<Int, Int>> = list2.zip(list) // defautl dari zip akan menjadi Pair<T, U>
    val list4: List<Int> = list2.zip(list) {item1, item2 ->
        item1 * item2
    }
    val list5 =  list3.unzip() // menghasilkan Pair<List<T>, List<U>>
    println(list3)
    println(list4)
    println(list5)
    println(list5.first)
    println(list5.second)
}