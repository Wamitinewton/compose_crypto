package com.example.compose_crypto.presentation.coin_list

import com.example.compose_crypto.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
