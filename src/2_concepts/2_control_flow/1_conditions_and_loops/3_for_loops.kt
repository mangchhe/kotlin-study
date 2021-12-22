package `2_concepts`.`2_control_flow`.`1_conditions_and_loops`

fun main() {
    var arr = IntArray(5) {it}
    for (i in arr) {
        print(i)
    }
    println()
    for (i in 1..3) {
        print(i)
    }
    println()
    for (i in 6 downTo 0) {
        print(i)
    }
    println()
    for (i in 6 downTo 0 step 2) {
        print(i)
    }
    println()
    for (i in 0..6 step 2) {
        print(i)
    }
    println()
    for (i in arr.indices) {
        println("$i ${arr[i]}")
    }
}