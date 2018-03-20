package fr.o80.ktpathkey.example

import fr.o80.ktpathkit.intAverage
import fr.o80.ktpathkit.isBetween
import fr.o80.ktpathkit.isGreaterOrEqual
import fr.o80.ktpathkit.isGreaterThan
import fr.o80.ktpathkit.isLessOrEqual
import fr.o80.ktpathkit.isLessThan
import fr.o80.ktpathkit.isLike

/**
 * @author Olivier PEREZ
 */
fun main(args: Array<String>) {
    val persons = listOf(Person("Olivier", 24), Person("Jordi", 8), Person("Thierry", 78))


    persons
            .filter(Person::age isGreaterThan 30)
            .filter(Person::age isGreaterOrEqual  30)
            .filter(Person::age isLessThan 80)
            .filter(Person::age isLessOrEqual  78)
            .filter(Person::age isBetween 30..78)
            .filter(Person::name isLike "^T.+")
            .filter(Person::canDrink)
    .forEach { println(it) }

    println(persons.all(Person::age isBetween 30..78)) // false
    println(persons.all(Person::age isGreaterThan  8)) // false
    println(persons.all(Person::age isGreaterOrEqual 8)) // true

    val ageAverage = persons.intAverage(Person::age)
    println("Age average $ageAverage")
}
