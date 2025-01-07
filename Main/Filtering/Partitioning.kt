package Main.Filtering

// bagian dari filtering
// membagi collestion menjadi yang masuk filtering dan yang tidak masuk filtering

fun main() {
    val list1 = (1..20).toList()
    val partitionPair = list1.partition { value -> value %2 == 1 } // secara default akan menghasilkan pair
    val (ganjil, genap) = list1.partition { value -> value % 2 == 1 }

    println(ganjil)
    println(genap)
    println(partitionPair)
}