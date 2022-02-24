package `4_null_safety`

/* 조건문으로 null 체크하는 방법 */
fun main() {
    var a: String? = "abs"
    val b = if (a != null) a.length else -1
    if (a != null && a.length > 0) {
        print("String of length ${a.length}")
    } else {
        print("Empty String")
    }
}