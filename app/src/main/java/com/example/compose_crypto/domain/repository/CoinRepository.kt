package com.example.compose_crypto.domain.repository

import com.example.compose_crypto.data.remote.dto.CoinDetailDto
import com.example.compose_crypto.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinsById(coinId: String): CoinDetailDto
}