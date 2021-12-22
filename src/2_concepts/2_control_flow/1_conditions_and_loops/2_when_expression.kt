package `2_concepts`.`2_control_flow`.`1_conditions_and_loops`

enum class Bit {
    ZERO, ONE
}

enum class Color {
    RED, GREEN, BLUE
}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}

fun main() {
    val a = 5
    when (a) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    val b: Bit = Bit.ZERO
    var numericValue = when (b) {
        Bit.ZERO -> 0
        Bit.ONE -> 1
    }

    val c: Color = Color.RED

    when (c) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        Color.BLUE -> println("blue")
    }

    when (c) {
        Color.RED -> println("red")
        else -> println("not red")
    }

    val d = 1

    when (d) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (d) {
        d.toInt() -> println("s encodes x")
        else -> println("s does not encode x")
    }

    when (d) {
        in 1..10 -> println("x is in the range")
        !in 1..10 -> println("x is outside the range")
        else -> println("none of the above")
    }

    println(hasPrefix("prefix test"))
    println(hasPrefix(1))
}