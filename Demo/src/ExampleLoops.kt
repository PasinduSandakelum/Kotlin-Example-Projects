
fun main(args: Array<String>) {
    var nums = 1..16
    var decNums = 16 downTo 1

    println("Get values 1 to 16")
    //for loop
    for(a in nums)
        print("$a ")

    println("\n\nGet values 1 to 16 step by 2")
    //for loop
    for(a in nums step 2)
        print("$a ")

    println("\n\nGet values 16 down to 1")
    //for loop
    for(b in decNums)
        print("$b ")

    println("\n\nGet values 1 to 16 reversed")
    //for loop
    for(b in decNums.reversed())
        print("$b ")

    var ltr  = 'A'..'Z'
    println("\n\nGet alphabetical order latters A - Z")
    //for loop
    for(l in ltr)
        print("$l ")

    println("\n Count is ${ltr.count()}")

}