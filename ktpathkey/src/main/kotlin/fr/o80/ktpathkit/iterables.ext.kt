package fr.o80.ktpathkit

/**
 * @author Olivier PEREZ
 */

import kotlin.reflect.KProperty1

fun <T> Iterable<T>.intAverage(kProperty: KProperty1<T, Int>) = sumBy(kProperty).toFloat() / count()
fun <T> Iterable<T>.floatAverage(kProperty: KProperty1<T, Float>) = map(kProperty).sum() / count()