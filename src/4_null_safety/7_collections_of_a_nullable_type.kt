package `4_null_safety`

/* nullable type elements in collection */
fun main() {
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    for (i in intList) {
        println(i)
    }
}