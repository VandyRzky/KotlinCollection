package Main

class Application (map: Map<String, String>){
    val name: String by map
    val version: String by map
}

fun main() {
    val app = Application(
        mapOf(
            "name" to "Application 1",
            "version" to "1.1.1"
        )
    )

    println(app.name)
    println(app.version)
}