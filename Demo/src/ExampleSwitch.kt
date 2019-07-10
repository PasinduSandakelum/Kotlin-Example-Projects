import model.User

fun main(args: Array<String>) {
    var num: Int = 2

    when(num){
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Give a proper input")
    }

    println("----------------Assign when for a variable----------------")

    num = 4

    var str = when(num){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Give a proper input"
    }

    println(str)
}