package `1_basic_syntax`

fun parseInt(str: String): Int? {
    return str.toIntOrNull();
}
fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    var y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    }
    else {
        println("$arg1 or $arg2 is not a number")
    }
}

fun main() {
    printProduct("99", "1")
    printProduct("a1", "12")
}