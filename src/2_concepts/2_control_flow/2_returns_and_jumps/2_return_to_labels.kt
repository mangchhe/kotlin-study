package `2_concepts`.`2_control_flow`.`2_returns_and_jumps`

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return
        print(it)
    }
    println("this point is unreachable")
}

// label
fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return
        print(it)
    }
    println("done with explicit label")
}

// implicit label
fun foo3() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return
        print(it)
    }
    println("done with explicit label")
}

// anonymous function
fun foo4() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int){
        if (value == 3) return // local return
        print(value)
    })
    println("done with explicit label")
}

fun main() {
    foo()
    println()
    foo2()
    foo3()
    foo4()
}
