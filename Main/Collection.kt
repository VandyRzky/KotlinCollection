package Main

fun <T> displayCollection (colection: Collection<T>){
    for (item in colection) println(item)
}
fun <T> displayMutableCollection (colection: MutableCollection<T>){
    for (item in colection) println(item)
}


fun main() {
    displayCollection(listOf("budi", "joko"))
    displayCollection(setOf("holla", "hi"))
    displayCollection(mapOf("a" to "hi").entries)
//    displayCollection(mapOf("a" to "hi")) // map bukan turunan collection

    displayMutableCollection(mutableListOf("budi", "joko"))
    displayMutableCollection(mutableSetOf("holla", "hi"))
    displayMutableCollection(mutableMapOf("a" to "hi").entries)
}