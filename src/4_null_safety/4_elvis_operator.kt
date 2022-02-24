package `4_null_safety`

import org.w3c.dom.Node

/* return, throw와 같은 형태도 사용 가능 */
fun foo(node: Node): String? {
    val parent = node.parentNode ?: return null
    val name = node.nodeName ?: throw IllegalArgumentException("name expected")
    return ""
}

/* 엘비스 연산자는 null이 아닐 때 사용자가 정의한 값을 반환하고 싶을 때 사용 : ?: */
fun main() {
    var a: String? = null
    val l: Int = if (a != null) a.length else -1
    val ll: Int = a?.length ?: -1
}