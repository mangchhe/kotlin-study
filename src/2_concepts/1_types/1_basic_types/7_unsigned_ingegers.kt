package `2_concepts`.`1_types`.`1_basic_types`

import kotlin.math.pow

/*
* UByte
* UShort
* UInt
* ULong
* */
fun main() {
    val a: Int = 2.0.pow(31).toInt()
    println(a) // 2147483647
    println(a + 1) // -2147483648

    val b: UInt = 2.0.pow(32).toUInt()
    println(b) // 4294967295
    println(b + 1u) // 0

    val c: UInt = 1u
    val d: UInt = 0x1Fu
    val e = 1u
    val f = 1U
    val g = 1UL
    println(c) // 1
    println(d) // 31
    println(e.javaClass) // UInt
    println(f.javaClass) // UInt
    println(g.javaClass) // ULong
}