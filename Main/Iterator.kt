package Main

fun <T> displayListIterator(iterator: ListIterator<T>){
    println("display next")
    while (iterator.hasNext()) println(iterator.next())
    println("display previous")
    while (iterator.hasPrevious()) println(iterator.previous())
}

fun <T> displayMutableListIterator(iterator: MutableListIterator<T>){
    println("display next")
    while (iterator.hasNext()) println(iterator.next())
    println("display previous")
    while (iterator.hasPrevious()) println(iterator.previous())
}

fun removeOddNumber(iterator: MutableListIterator<Int>){
    while (iterator.hasNext()){
        val check = iterator.next()
        if (check % 2 == 1){
            iterator.remove()
        }
    }
}



fun main() {
    displayListIterator(listOf(1,2,3,4,5).listIterator())
    val list = mutableListOf(1,2,3,4,5,6,7)
    displayMutableListIterator(list.listIterator())
    removeOddNumber(list.listIterator())
    displayMutableListIterator(list.listIterator())

}