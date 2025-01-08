package Main.Operation

//mengambil sebagian elemen yang ada pada collection

fun main() {
    val list1 = listOf("a", "b", "c", "ab", "bc", "ca", "aa", "bb", "cc")
    val list2 = list1.take(3) //mengambil elemen di awal sesuai dengan parameter
    val list3 = list1.takeLast(3) // mengambil elemen di akhir
    val list4 = list1.takeWhile { value -> value < "ab" } // ngambil elemen sesuai dengan kondisi true
    //jika false dia akan berhenti
    val list5 = list1.takeLastWhile { value -> value > "aa" }

    val list6 = list1.drop(3) //drop untuk menghapus
    val list7 = list1.dropLast(3)
    val list8 = list1. dropWhile { value -> value <= "c" }
    val list9 = list1. dropLastWhile { value -> value > "c" }

    println(list2)
    println(list3)
    println(list4)
    println(list5)
    println(list6)
    println(list7)
    println(list8)
    println(list9)
}