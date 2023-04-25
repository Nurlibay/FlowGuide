package uz.nurlibay.flowguide.operators

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val flow = flow<Int> {
        (1..10).forEach { value ->
            delay(1000)
            emit(value)
        }
    }

    flow.collectLatest {
        delay(1500)
        println("Latest -> $it")
    }
}