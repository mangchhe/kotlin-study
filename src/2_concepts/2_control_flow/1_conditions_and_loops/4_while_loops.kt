package `2_concepts`.`2_control_flow`.`1_conditions_and_loops`

fun main() {
    var a = 5
    while (--a > 0) {
        print(a) // 4 ~ 1
    }
    println()

    var b = 5
    do {
        print(b) // 5 ~ 0
    } while (b-- > 0)
}