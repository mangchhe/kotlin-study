package `2_concepts`.`1_types`.`1_basic_types`

/*
* equality checks
*   - ==
*   - !=
* comparison operators
*   - <, >
*   - <=, >=
* range instantiation
*   - a..b
* range checks
*   - x in a..b
*   - x !in a..b
* */
fun main() {
    val a = 1
    val b = 2
    val c = a..b
    for (i in c) {
        println(i)
    }
    for (c in 'A'..'C') {
        println(c)
    }
    if (1 in c) {
        println("1이 존재함")
    }
    if (3 !in c) {
        println("3이 존재하지 않음")
    }
}