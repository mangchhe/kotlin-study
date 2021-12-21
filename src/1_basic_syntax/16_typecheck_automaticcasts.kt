package `1_basic_syntax`

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null

    return obj.length
}

fun getStringLength3(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}

fun main() {
    println(getStringLength("Hello World"))
    println(getStringLength(3))

    println(getStringLength2(""))
    println(getStringLength2(3))

    println(getStringLength3(""))
    println(getStringLength3(3))
}