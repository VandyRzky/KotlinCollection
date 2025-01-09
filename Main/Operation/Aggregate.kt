package Main.Operation

// max() & min()
// average()
// sum()
// count()

fun main() {
    val list= (1..20).toList()
    println(list.max())
    println(list.min())
    println(list.average())
    println(list.sum())
    println(list.count())
    println(list.sumBy { it / 3 })

    val listString = listOf("hi", "halo", "holla")
    println(listString.maxBy { it.length })
    println(listString.minBy { it.length }) // pake selector
    println(listString.maxWith(compareBy{it.length})) //pake comparator
    println(listString.sumBy { it.length })

}