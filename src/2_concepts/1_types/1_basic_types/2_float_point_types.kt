package `2_concepts`.`1_types`.`1_basic_types`

fun printDouble(d: Double) { println(d) }

/*
* Float
* Double
* */
fun main() {
    val pi = 3.14
    val oneDouble = 1.0
    // var oneDouble: Double = 1 // Int 리터털을 Double 타입으로 초기화 불가능

    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // 2.718217

    // 암시적 타입 변환 X
    printDouble(1.0)
    // printDouble(1)
    // printDouble(1.0f)
}