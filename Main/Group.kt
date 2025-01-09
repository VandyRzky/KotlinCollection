package Main

fun main() {
    val list = listOf("a", "a", "b", "b", "c", "c")
    val group: Grouping<String, String> = list.groupingBy { it }
    println(group.eachCount()) // menghitung tiap grup ada beberapa dataa
    println(group.fold(""){first, second -> first + second})
    println(group.reduce{key, first, second -> first + second})
    println(group.aggregate{key, accumulator: String?, element, first ->
        if(first) element
        else accumulator + element
    })
}