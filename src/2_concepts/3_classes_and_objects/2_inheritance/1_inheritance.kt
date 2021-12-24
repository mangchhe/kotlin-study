package `2_concepts`.`3_classes_and_objects`.`2_inheritance`

import javax.naming.Context
import javax.swing.text.AttributeSet

/* 모든 클래스는 기본적으로 Any 클래스를 상속하고 있다. */
class Example

/*
*  기본적으로 코틀린 클래스는 final 이기 때문에 상속이 불가능하다.
*  상속 받기 위해서는 open 키워드를 사용해야 한다.
*  */
open class Base(p: Int)
class Derived(p: Int) : Base(p)

/*
*  파생 클래스에 기본 생성자가 없을 경우
*  super 키워드를 사용하여 초기화해야한다.
*  */
open class View {
    constructor(ctx: Context)
    constructor(ctx: Context, attrs: AttributeSet)
}
class MyView : View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}

fun main() {
    val ex = Example()
    /* Any는 세 개의 메소드가 정의되어 있다. */
    ex.toString()
    ex.equals("")
    ex.hashCode()
}