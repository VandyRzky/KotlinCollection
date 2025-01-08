package Main.Operation

// jenis: natural order, costum order, ordering reverse, random order
//buat ngurutin data

//ordering reverse untuk mendapatkan collection dengan urutan terbalik dari data aslinya

// random order mengacak isi dari collection

data class Fruit(val name:String, val quantity: Int)

fun main() {
    val list = listOf(1,7,6,3,8,2)
    val listString = listOf("c", "a", "d", "f", "g", "j")
    println("natural order")
    println(list.sorted())
    println(list.sortedDescending())
    println(listString.sorted())
    println(listString.sortedDescending())

    val fruits = listOf(
        Fruit("apple", 10),
        Fruit("banana", 5),
        Fruit("melon", 15)
    )
    println("costum order")
    println(fruits.sortedBy { fruit -> fruit.name })
    println(fruits.sortedByDescending { fruit -> fruit.quantity })
    println(fruits.sortedWith(Comparator { fruit1, fruit2 ->
        fruit1.quantity.compareTo(fruit2.quantity)
    }))

    println("ordering reverse")
    val listString2 = listString.toMutableList()
    val Reversed = listString2.reversed() //reversed akan membuat collection baru
    val asReversed = listString2.asReversed()//asReversed akan mengubah collection yang dipilih

    println(Reversed)
    println(asReversed)

    listString2.add("z")

    println(Reversed)
    println(asReversed)

    println("random order")
    val numbers = (1..10).toList()
    println(numbers.shuffled())
    println(numbers.shuffled())
    println(numbers.shuffled())



}