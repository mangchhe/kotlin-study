package `2_concepts`.`2_control_flow`.`3_exceptions`

fun fail(message: String): Nothing {
     throw IllegalArgumentException(message)
}

fun main() {
     try {
          var b = null ?: throw NullPointerException()
     } catch (e: NullPointerException) {
          println("null")
     }

     try {
          fail("error")
     } catch (e: IllegalArgumentException) {
          println("illegal")
     }
}