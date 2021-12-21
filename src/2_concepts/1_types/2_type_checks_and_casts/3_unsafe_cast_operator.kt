package `2_concepts`.`1_types`.`2_type_checks_and_casts`

fun getText(x: Any) : Boolean {
    val ret: String = x as String
    return true
}

fun getText2(x: Any?) : Boolean {
    val ret: String? = x as String?
    return true
}

fun main() {
    val a = "1"
    val b = 1
    getText(a)
    // getText(b) // ClassCastException
    getText2(null)
    getText2(a)
    // getText2(b) // ClassCastException
}