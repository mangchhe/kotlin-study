package `2_concepts`.`3_classes_and_objects`.`2_inheritance`

open class Base2(val name: String) {
    init {
        println("Initializing a base class")
    }
    open val size: Int =
        name.length.also { println("Initializing size in the base class: $it ") }
}

class Derived2(
    name: String,
    val lastName: String, ) : Base2(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {
    init {
        println("Initializing a derived class")
    }
    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}

fun main() {
    /* Base2 init -> properties -> Derived2 init -> properties */
    val dv = Derived2("joohyun", "ha")
    println("${dv.lastName} ${dv.name}")
}