package `2_concepts`.`1_types`.`1_basic_types`

/*
* 메모리 최적화 때문에 Int -128 ~ 127은 동일한 객체이다.
* */
fun main() {
    val a: Int = 127
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 128
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false
    println(boxedB == anotherBoxedB) // true
}