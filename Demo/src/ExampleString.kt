fun main(args: Array<String>) {
    var str1: String = "Pasindu"
    var str2: String = "pasindu"

    println("-----------------compare with case------------")
    if (str1.equals(str2)) {
        println("Same")
    } else {
        println("Not same")
    }

    println("-----------------compare with ignorecase------------")
    if (str1.equals(str2, true)) {
        println("Same")
    } else {
        println("Not same")
    }

    println("-----------------compare with == sign------------")
    if (str1 == str2) {
        println("Same")
    } else {
        println("Not same")
    }
}