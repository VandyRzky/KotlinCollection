package Main

// ada key dan value, key sebagai index

fun main() {
    val map: Map<String, String> = mapOf(
        "a" to "budi",
        "b" to "joko"
    )

    println(map.size)
    println(map["a"])

    for (value in map){
        print(value.key+ " ")
        println(value.value)
    }
    for((key, value) in map){
        println("$key to $value")
    }
    println(map.entries)

    val mapMutable: MutableMap<String, String> = mutableMapOf()
    mapMutable.put("a", "halo")
    mapMutable["b"] = "hi"
    println(mapMutable.entries)
    mapMutable.remove("b")
    println(mapMutable.entries)
    println(mapMutable.getOrDefault("b", "tidak ditemukan"))
}
