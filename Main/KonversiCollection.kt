package Main

fun <T> displayCollectionConvertion(collection: Collection<T>){
    for (value in collection) println(value)
}

fun main() {
    val array= arrayOf(1,2,3,4)
    val range = 1..10
    val list = array.toList()
    val set = range.toSet()

    displayCollectionConvertion(list)
    displayCollection(set)

}