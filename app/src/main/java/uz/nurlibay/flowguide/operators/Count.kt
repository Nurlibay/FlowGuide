package uz.nurlibay.flowguide.operators

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val walletListFlow: Flow<List<WalletItemEntity>> = walletList()
    val walletListSize = walletListFlow.count()
    println(walletListSize)
}

fun walletList(): Flow<List<WalletItemEntity>> = flow {
    emit(listOf(WalletItemEntity(1, "Wallet 1"), WalletItemEntity(2, "Wallet 2")))
}

data class WalletItemEntity(
    val id: Int,
    val name: String
)