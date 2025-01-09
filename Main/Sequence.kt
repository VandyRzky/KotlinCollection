package Main

// collection selain map, list, set
// berbeda pada cara kerjanya jika ditambahkan banyak operasi
// data yang diesekusi hanya data yang diperlukan


fun main() {
    val words = "the quick brown fox jumps over the lazy dog".split(" ")
    val wordSequence = words.asSequence()

    val lengthSequence = wordSequence
        .filter { println("filter: $it"); it.length >3 }
        .map { println("map: $it"); it.toUpperCase()}
        .take(4)

    println(lengthSequence.toList())
}