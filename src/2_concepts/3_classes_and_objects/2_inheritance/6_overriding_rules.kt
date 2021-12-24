package `2_concepts`.`3_classes_and_objects`.`2_inheritance`

open class Rectangle4 {
    open val a : Int = 1
    open fun draw() {}
}

interface Polygon2 {
    val a : Int get() = 2

    fun draw() {}
    fun draw2() {}
}

/*
* 상속 받은 멤버 중에 동일한 것이 있다면
* 자식이 반드시 오버라이딩을 해주어야 한다.
* 원하는 걸 사용하기 위해서는 super<사용하길 원하는 부모 클래스명>
* */
class Square() : Rectangle4(), Polygon2 {
    override val a: Int
        get() = 4

    override fun draw() {
        super<Rectangle4>.draw()
        super<Polygon2>.draw()
        super.draw2()
    }
}

fun main() {

}