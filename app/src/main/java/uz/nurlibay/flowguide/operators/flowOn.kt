package uz.nurlibay.flowguide.operators

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val flow = flow {
        (0..10).forEach {
            delay(500)
            emit(it)
        }
    }.flowOn(Dispatchers.Default)

    this.launch {
        flow.collect {
            println(it)
        }
    }
}