package `2_concepts`.`1_types`.`2_type_checks_and_casts`

fun demo(x: Any) {
    if (x is String) {
        println(x.length)
    }
}

fun demo2(x: Any) {
    if (x !is String) return
    println(x.length)
}

fun demo3(x: Any) {
    if (x !is String || x.length == 0)
        return
    println(x.length)
}

fun demo4(x: Any) {
    if (x is String && x.length > 0) {
        println(x.length)
    }
}

fun demo5(x: Any) {
    when (x) {
        is Int -> println(x + 1)
        is String -> println(x.length + 1)
        is IntArray -> print(x.sum())
    }
}

fun main() {
    demo(5)
    demo("hello world!")
    demo2(5)
    demo2("hello world!")
    demo3(5)
    demo3("hello world!")
    demo4(5)
    demo4("hello world!")
    demo5(5)
    demo5("hello world!")
    demo5(IntArray(5){ it })
}