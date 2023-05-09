package uz.nurlibay.flowguide.operators

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val flow1 = (1..10).asFlow()
    val flow2 = (11..20).asFlow()

    val resultFlow = flow1.zip(flow2) { a, b ->
        "a -> $a, b -> $b"
    }

    resultFlow.onEach {
        println(it)
    }.launchIn(this)
}