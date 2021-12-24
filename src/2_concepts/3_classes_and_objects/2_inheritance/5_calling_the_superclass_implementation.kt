package `2_concepts`.`3_classes_and_objects`.`2_inheritance`

open class Rectangle3 {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

/*
* outer class : super 키워드
* inner class : super@Outer 클래스명
* */
class FilledRectangle : Rectangle3() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
        var filter = Filter()
        filter.drawAndFill()
    }
    val fillColor: String get() = super.borderColor

    inner class Filter {
        fun fill() { println("Filling") }
        fun drawAndFill() {
            super@FilledRectangle.draw()
            fill()
            println(super@FilledRectangle.borderColor)
        }
    }
}

fun main() {
    FilledRectangle().draw()
}