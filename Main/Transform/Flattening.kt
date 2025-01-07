package Main.Transform

//untuk mengubah nested collsection menjadi flat

class Member (val name: String, val hobies:List<String>)

fun main() {
    val nestedList: List<List<Int>> = listOf(
        listOf(1,3,4,5),
        listOf(2,6,7,8)
    )
    val flatList = nestedList.flatten()

    println(nestedList)
    println(flatList)

    val member = listOf(
        Member("joko", listOf("traveling", "playing")),
        Member("Budi", listOf("gaming", "running"))
    )
    val hobies = member.flatMap { it.hobies  }
    println(hobies)
}