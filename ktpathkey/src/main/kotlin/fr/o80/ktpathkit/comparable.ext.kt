package fr.o80.ktpathkit

/**
 * @author Olivier PEREZ
 */

import kotlin.reflect.KProperty1

infix fun <O, P : Comparable<P>> KProperty1<O, P>.isGreaterThan(r: P): (O) -> Boolean {
    return { this.get(it) > r }
}

infix fun <O, P : Comparable<P>> KProperty1<O, P>.isGreaterOrEqual(r: P): (O) -> Boolean {
    return { this.get(it) >= r }
}

infix fun <O, P : Comparable<P>> KProperty1<O, P>.isLessThan(r: P): (O) -> Boolean {
    return { this.get(it) < r }
}

infix fun <O, P : Comparable<P>> KProperty1<O, P>.isLessOrEqual(r: P): (O) -> Boolean {
    return { this.get(it) <= r }
}

infix fun <O, P : Comparable<P>> KProperty1<O, P>.isBetween(closedRange: ClosedRange<P>): (O) -> Boolean {
    return { this(it) in closedRange }
}

infix fun <O, P : Comparable<P>> KProperty1<O, P>.isNotBetween(closedRange: ClosedRange<P>): (O) -> Boolean {
    return { this(it) !in closedRange }
}

infix fun <O, P : CharSequence> KProperty1<O, P>.isLike(like: String): (O) -> Boolean {
    return { Regex(like).matches(this(it)) }
}