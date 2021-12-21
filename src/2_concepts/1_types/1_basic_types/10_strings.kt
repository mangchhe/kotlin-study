package `2_concepts`.`1_types`.`1_basic_types`

fun main() {
    val a = "AbCd 123"
    val b: String = ""
    val c = "     ab      "

    for (c in a) {
        println(c)
    }
    println(a.uppercase())
    println(a.lowercase())

    print(b + 1 + "asd" + '\n')
    println(c.trim());

    val d = 1
    println("d = $d")
    println("$a.length is ${a.length}")
}