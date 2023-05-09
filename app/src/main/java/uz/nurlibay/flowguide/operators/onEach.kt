package uz.nurlibay.flowguide.operators

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    (1..10).asFlow().filter {
        it % 2 == 0
    }.collect {
        println(it)
    }
}