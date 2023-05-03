package uz.nurlibay.flowguide.operators

import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    println(flowOf(1, 2, 3)
        .reduce { acc, value -> acc + value })
}