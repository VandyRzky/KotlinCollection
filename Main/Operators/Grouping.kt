package Main.Operators

// operasi meng-grup element yang ada di dalam collection

fun main() {
    val list = listOf("a", "a", "b", "b", "c", "aa", "bb", "abc", "aaa")
    //groupby menghasilkan map
    val map: Map<Int, List<String>> = list.groupBy { value -> value.length }
    // groupingby menghasilkan grouping
    val group: Grouping<String, String> = list.groupingBy { it }

    val list2 = (1..20).toList()

    val groupOfNumber = list2.groupBy { value -> value %2 ==0 }
    val groupOfNumber2 = groupOfNumber.mapKeys { (key, _) ->
        if (key != true) "Ganjil"
        else "Genap"
    }
    val ganjil = groupOfNumber[false]
    val genap = groupOfNumber[true]

    println(map)
    println(group)
    println(groupOfNumber)
    println(groupOfNumber2)
    println(ganjil)
    println(genap)
}