package `2_concepts`.`2_control_flow`.`3_exceptions`

import java.lang.NumberFormatException
import java.lang.RuntimeException

fun main() {
    try {
        throw NullPointerException("error")
    } catch (e: RuntimeException) {
        println(e.message)
    } catch (e: NullPointerException) {
        println(e.message)
    } finally {
        println("finally")
    }

    val a: Int? = try {
        readLine()?.toInt()
    } catch (e: NumberFormatException) {
        null
    }
    println(a)
}