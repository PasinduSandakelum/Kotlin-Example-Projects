import model.User

fun main(args: Array<String>) {
    var str1: String? = null
    var user: User? = User();

    user = null

    println("str1 : "+str1)
    println("user : "+user)
    println("user.name : "+user?.name)
}