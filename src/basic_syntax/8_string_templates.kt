package basic_syntax

fun main() {
    var a = 1
    var s1 = "a is $a"

    a = 2
    var s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s1)
    println(s2)
}
