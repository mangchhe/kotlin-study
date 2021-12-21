package `2_concepts`.`1_types`.`1_basic_types`

fun main() {
    val arr = Array(5) { i -> (i * i).toString() }
    for (s in arr) {
        print("$s ")
    }
    println()

    val arr2: IntArray = intArrayOf(1, 2, 3)
    arr2[0] = arr2[1] + arr2[2]
    println(arr2[0]) // 5

    var arr3 = IntArray(5)
    for (i in arr3) {
        print("$i ")
    }
    println()

    var arr4 = IntArray(5){ 42 }
    for (i in arr4) {
        print("$i ")
    }
    println()

    var arr5 = IntArray(5){ it } // it * 1 같음
    for (i in arr5) {
        print("$i ")
    }
    println()
}