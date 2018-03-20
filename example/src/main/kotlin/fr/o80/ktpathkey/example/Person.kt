package fr.o80.ktpathkey.example

/**
 * @author Olivier PEREZ
 */
data class Person(val name: String, val age: Int) {
    fun canDrink() = age >= 18
}