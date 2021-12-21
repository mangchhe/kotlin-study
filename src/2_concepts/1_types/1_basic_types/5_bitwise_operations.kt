package `2_concepts`.`1_types`.`1_basic_types`

/*
* shl : 왼쪽 shift
* shr : 오른쪽 shift
* ushr : 부호 상관없이 오른쪽 쉬프트
* and, or, xor
* inv : 비트 반전
* */
fun main() {
    println(1.shl(1)) // 2
    println(2.shr(1)) // 1
    println(2.or(1)) // 3
    println(1.xor(1)) // 0
    println(1.xor(0)) // 1
    println(2.ushr(0)) // 0
}