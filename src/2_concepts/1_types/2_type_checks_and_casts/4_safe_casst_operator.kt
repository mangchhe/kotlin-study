package `2_concepts`.`1_types`.`2_type_checks_and_casts`

fun getText3(x: Any) : String? {
    val ret: String? = x as? String
    return ret
}

fun main() {
    val a = "1"
    val b = 1
    println(getText3(a))
    println(getText3(b))
}