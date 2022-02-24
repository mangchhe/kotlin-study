package `4_null_safety`

/* 대상 값을 as로 지정한 타입으로 캐스팅하며 불가능하다면 null을 반환 : as? */
fun main() {
    var a: String? = null

    var aInt: Int? = a as? Int
    print(aInt)

    var bInt: Int? = a as Int // NPE 발생
}