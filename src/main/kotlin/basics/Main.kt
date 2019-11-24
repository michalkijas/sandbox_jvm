package basics


fun main(args: Array<String>) {


    val x: String = "zz"
//    x = "1"

    var y: String = "zz"
    y = "1"
//    y = 1

    val name = "a".."b"

    val list1 = listOf(1, 2, 3)

//    list1.indices
    arrayListOf(1, 2, 3).indices

    println("Hellow ${name.contains("A")} ")


    val x1 = 15

    when (x1) {
        1 -> println("1")
        2 -> println("222")
        else -> println("Not found")
    }


    when {
        x1 < 15 -> println("mniejsze")
        x1 > 15 -> println("więszke")
        else -> println("Inne")
    }
}


fun doSomething(value1: String): Int = value1.length
