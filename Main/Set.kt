package Main

// isi data harus unik dan tidak pasti berurut
class Person(val name: String){
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean =  when (other) {
        is Person -> this.name == other.name
        else -> false
    }
}


fun main() {
    // immutable set
    val set: Set<Person> =
        setOf(Person("budi"), Person("Joko"), Person("Joko") )
    println(set.size)

    for (i in set) {
        println(i.name)
    }
    //mutable set
    val setMutable: MutableSet<Person> = mutableSetOf()
    for (i in set){
        setMutable.add(Person(i.name))
    }
    for (i in setMutable) {
        println(i.name)
    }

    val setInt = setOf(2,4,6,8)
    for (i in setInt){
        println(i)
    }



}