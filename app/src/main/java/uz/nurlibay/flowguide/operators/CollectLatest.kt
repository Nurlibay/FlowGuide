package uz.nurlibay.flowguide.operators

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.plus
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val flow = flow<Int> {
        println("Flow started")
        (1..10).forEach { value ->
            delay(1000)
            println("Set $value")
            emit(value)
        }
        println("Flow ending")
    }

    flow.collectLatest {
        delay(1500)
        println("Latest -> $it")
    }
}