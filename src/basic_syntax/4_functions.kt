package basic_syntax

fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int) = a - b

fun printAdd(a: Int, b: Int): Unit {
    println("add of $a and $b is ${a + b}")
}

//fun printSubtract(a: Int, b: Int) = println("subtract of $a and $b is ${a - b}")

fun printSubtract(a: Int, b: Int) {
    println("subtract of $a and $b is ${a - b}")
}

fun main() {
    println(add(1, 2))
    println(subtract(2, 1))
    printAdd(1, 2)
    printSubtract(2, 1)
}