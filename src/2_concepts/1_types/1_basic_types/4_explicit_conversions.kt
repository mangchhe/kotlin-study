package `2_concepts`.`1_types`.`1_basic_types`

/*
* toByte(), toUByte()
* toShort(), toUShort()
* toChar()
* toInt(), toUInt()
* toLong(), toULong()
* toFloat()
* toDouble()
* */
fun main() {
    val c: Int? = 1
    val d: Long? = c?.toLong()
    val g: Double? = c?.toDouble()

    // the type is inferred
    println(1 + 3L) // Int + Long
    println(1 + 3f) // Int + Float
    println(1.0 + 3f) // Double + Float

    /* Operations */
    val x = 5 / 2 // Int 반환
    // println(x == 2.5)
    println(x == 2)

    val x2 = 5L / 2
    // println(x2 == 2)
    println(x2 == 2L)

    val x3 = 5 / 2.toDouble() // Double 반환
    println(x3 == 2.5)
}