package `2_concepts`.`2_control_flow`.`2_returns_and_jumps`

fun main() {
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            if (j == 3) {
                break@loop
            }
            println("$i $j")
        }
    }
}
