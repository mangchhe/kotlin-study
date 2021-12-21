package `1_basic_syntax`

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println(maxOf(5, 4))
    println(maxOf(5, 4))
}