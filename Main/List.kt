package Main

//


fun main() {
    val list: List<String> = listOf("halo", "hai", "hola") //deklarasi imutable list

    println(list[0])
    println(list.indexOf("hai"))
    println(list.isEmpty())
    println(list.isNotEmpty())
    println(list.containsAll(listOf("halo", "hai")))
    println(list.contains("hola"))

    println("")

    val listMutable: MutableList<Int> = mutableListOf() // deklarasi mutable list
    listMutable.add(1)
    listMutable.add(3)
    listMutable.add(5)
    for (i in listMutable){
        println(i)
    }
    listMutable.removeAt(2)
    for (k in 1..listMutable.size){
        println(k)
    }


}