package `4_null_safety`

/* Null이 아닌 경우에만 호출 : ?. */
fun main() {
    val b: String? = null
    println(b?.length)

    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) }
    }
}