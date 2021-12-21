package `2_concepts`.`1_types`.`1_basic_types`

/*
* || : disjunction(논리합)
* && : conjunction(논리곱)
* ! : negation(부정)
* */
fun main() {
    val a: Boolean = true
    val b: Boolean = false
    val c: Boolean? = null

    println(a || b) // true
    println(a && b) // false
    println(!b) // true
}