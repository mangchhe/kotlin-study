package basic_syntax

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun main() {
    println(describe(1))
    println(describe(2))
    println(describe("Hello"))
    println(describe(3L))
    println(describe("World"))
}