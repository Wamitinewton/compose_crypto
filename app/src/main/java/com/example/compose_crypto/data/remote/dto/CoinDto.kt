package com.example.compose_crypto.data.remote.dto

import com.example.compose_crypto.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDto(
    val id: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    @SerializedName("is_new")
    val isNew: Boolean,
    @SerializedName("is_active")
    val isActive: Boolean,
    val type: String,
)

fun CoinDto.toCoinDto(): Coin {
    return Coin(
        id = id,
        isActive = isActive,

        name = name,
        symbol = symbol,
        rank = rank,
    )
}
