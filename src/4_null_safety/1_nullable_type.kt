package `4_null_safety`

/* nullable type : ? */
fun main() {
    var a: String = "abc"
    // a = null
    a.length

    var b: String? = "abc"
    b = null
    // b.length
}