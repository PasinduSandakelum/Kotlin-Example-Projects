import model.User

fun main(args: Array<String>) {
    println("Hello World !");

    var user = User();
    user.name = "Pasindu";

    println("Name is : " + user.name);

    println("Name is : ${user.name}");
}