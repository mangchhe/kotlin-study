package `2_concepts`.`3_classes_and_objects`.`2_inheritance`

open class Shape2 {
    open val vertexCnt : Int = 0
}

/* val -> val, var(O) , var -> var (O), var -> val (X) */
class Rectangle : Shape2() {
    override val vertexCnt: Int = 3
    // override var vertexCnt: Int = 3
}

interface Shape3 {
    val vertexCnt : Int
}

// 항상 4로 고정
class Rectangle2(override val vertexCnt: Int = 4) : Shape3

// 값 변경 가능
class Polygon : Shape3 {
    override var vertexCnt: Int = 0
}

fun main() {
    val rec = Rectangle2()
    val pol = Polygon()
    // rec.vertexCnt = 5
    pol.vertexCnt = 5
}