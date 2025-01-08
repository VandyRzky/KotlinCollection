package Main.Operation

// memotong collection menjadi beberapa collection

fun main() {
    val list1 = (1..20).toList()
    val list2 = list1.chunked(3)
    val list3 = list1.chunked(3){ values ->
        var total = 0
        for (value in values){
            total += value
        }
        total
    }

    println(list2)
    println(list3)
}