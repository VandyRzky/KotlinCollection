package Main.Filtering

//untuk mengecek isi data dari collection
//menghasilkan true/false


fun main() {
    val list = listOf("hi", "hola", "hallo")

    //any untuk mengecek minimal ada 1 data yang memenuhi kondisi
    println(list.any { value -> value.length > 2 })
    //none untuk mengecek tidak ada satupun data yang sesuai dengan kondisi
    println(list.none{value -> value.length > 2})
    //all mengcek semua data sesuai dengan kondisi
    println(list.all { it.length < 1  })
    //any() mengecek collection memiliki data
    println(list.any())
    //none() mengecek collection tidak memiliki data
    println(list.none())
}