package `2_concepts`.`3_classes_and_objects`.`2_inheritance`

/*
* open 키워드가 있다면 오버라이딩이 가능
* */
open class Shape {
    open fun draw() {}
    fun fill() {}
}
/* 하위 클래스가 또 오버라이딩이 가능한 것을 막기 위해선 final 키워드 사용 */
open class Circle() : Shape() {
    final override fun draw() {}
}
class Small() : Circle() {
    // override fun draw() {}
}

fun main() {
    val circle = Circle()
    circle.draw()
    circle.fill()
}