package `2_concepts`.`2_control_flow`.`1_conditions_and_loops`

fun main() {
    val a = 1
    val b = 2
    var max = 0
    if (a > b)
        max = a
    else
        max = b

    max = if (a > b) a else b

    val min = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

    println("$max $min")
}