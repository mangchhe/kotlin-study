package `2_concepts`.`1_types`.`2_type_checks_and_casts`

fun main() {
    val obj = ""
    if (obj is String) {
        println(obj.length)
    }

    if (obj !is String) {
        println("Not a String")
    } else {
        println(obj.length)
    }


}