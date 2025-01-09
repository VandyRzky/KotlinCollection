package Main.Operation

// untukmembuat aggregate secara manual

fun main() {
    val number = (1..20).toList()

    val min = number.reduce{ a, b ->
        if (a > b) b
        else a
    }

    val sum = number.fold(0){ a, b ->
        a + b
    }
//    sama aja tapi dari akhir
//    number.reduceRight()
//    number.foldRight()
//    number.reduceIndexed() // ada parameter index di awal


}
