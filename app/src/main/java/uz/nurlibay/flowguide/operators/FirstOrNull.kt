package uz.nurlibay.flowguide.operators

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val flow: Flow<Int> = flowOf(8, 6, 7, 5)
    val firstValue = flow.firstOrNull()
    println(firstValue)
}