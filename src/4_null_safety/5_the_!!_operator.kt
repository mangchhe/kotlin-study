package `4_null_safety`

/* 널이 아님을 보증, 널이라면 NPE 발생 : !! */
fun main() {
    var a: String? = "Kotlin"
    val l = a!!.length
}