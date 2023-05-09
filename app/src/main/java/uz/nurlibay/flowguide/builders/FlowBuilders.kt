package uz.nurlibay.flowguide.builders

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val flow1 = flowOf(1, 2, 3, 4)
    val flow2 = (1..5).asFlow()
    val flow3 = flow {
        (1..10).forEach {
            emit(it)
        }
    }
    val flow4 = channelFlow {
        (1..5).forEach {
            send(it)
        }
    }
}