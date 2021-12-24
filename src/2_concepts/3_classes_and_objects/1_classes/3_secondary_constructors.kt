package `2_concepts`.`3_classes_and_objects`.`1_classes`

class Person6(val pets: MutableList<Pet> = mutableListOf())

/* 보조 생성자 */
class Pet {
    constructor(owner: Person6) {
        owner.pets.add(this)
    }
}

/* 기본 생성자가 있는데 보조 생성자를 생성할 시 기본 생성자를 위임해야된다. */
class Person7(val name: String) {
    val children: MutableList<Person7> = mutableListOf()
    constructor(name: String, parent: Person7) : this(name) {
        parent.children.add(this)
    }
}

/* 기본 생성자는 없지만 위임은 여전히 일어나기 때문에 init block이 실행된다. */
class Constructors {
    init {
        println("Init Block")
    }
    constructor(i: Int) {
        println("Constructor $i")
    }
}

/* 기본 생성자를 가지길 원치않는다면 private */
class DontCreateMe private constructor() {}

fun main() {
    Constructors(1)
}