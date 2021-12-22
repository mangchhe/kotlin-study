package `2_concepts`.`2_control_flow`.`1_conditions_and_loops`

fun main() {
    for (i in 1..3) {
        if (i == 2)
            break
        println(i) // 1
    }

    for (i in 1..3) {
        if (i == 2)
            continue
        println(i) // 1, 3
    }
}