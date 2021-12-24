package `2_concepts`.`3_classes_and_objects`.`1_classes`

class Person2 constructor(firstName: String) {}

/* 접근 제어자나 any annotation이 없다면 constructor 생략 가능 */
class Person3(firstName: String) {}

/* 기본 생성자는 코드를 가질 수 없고 init 키워드를 사용한 block을 이용한다. */
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints $name")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

/* Default 값 지정 */
class Person4(val firstName: String, val lastName: String, var isEmployed: Boolean = true) {}

class Person5(
    val firstName: String,
    val lastName: String,
    var age: Int, // trailing comma
)

class Customer(name: String) {
    val customerKey = name.uppercase().also(::println)
}

class Customer2 public constructor(name: String)

fun main() {
    InitOrderDemo("JooHyun Ha")
    Customer("JooHyun Ha")
    println(Person4("JooHyun", "Ha").isEmployed)
}