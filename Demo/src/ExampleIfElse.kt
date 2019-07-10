fun main(args: Array<String>) {
    var num1 = 4
    var num2 = 7

    var result: Int;

    if (num1 > num2) {
        println("$num1 is greater than $num2")
    } else {
        println("$num1 is lower than $num2")
    }

    println("--------Using expression in kotlin-----------")

    result = if (num1 > num2)
        num1
    else
        num2

    println("Result is $result")
}