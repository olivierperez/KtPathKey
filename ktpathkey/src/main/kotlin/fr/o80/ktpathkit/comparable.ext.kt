package fr.o80.ktpathkit

/**
 * @author Olivier PEREZ
 */

import kotlin.reflect.KProperty1

infix fun <O, P : Comparable<P>> KProperty1<O, P>.isGreaterThan(r: P): (O) -> Boolean {
    return { obj -> this.get(obj) > r }
}

infix fun <O, P : Comparable<P>> KProperty1<O, P>.isLessThan(r: P): (O) -> Boolean {
    return { obj -> this.get(obj) < r }
}