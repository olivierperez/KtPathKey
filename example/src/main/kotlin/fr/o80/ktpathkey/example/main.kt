package fr.o80.ktpathkey.example

import fr.o80.ktpathkit.isGreaterThan
import fr.o80.ktpathkit.isLessThan

/**
 * @author Olivier PEREZ
 */
fun main(args: Array<String>) {
    listOf(Person("Olivier", 23), Person("Thierry", 78))
            .filter(Person::age isGreaterThan 30)
            .filter(Person::age isLessThan 80)
    .forEach { println(it) }
}