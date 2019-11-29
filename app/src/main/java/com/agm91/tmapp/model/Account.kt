package com.agm91.tmapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Account(
    @SerializedName("accountBalanceInCents") val accountBalanceInCents: Int,
    @SerializedName("accountCurrency") val accountCurrency: String,
    @SerializedName("accountId") val accountId: Long,
    @SerializedName("accountName") val accountName: String,
    @SerializedName("accountNumber") val accountNumber: String,
    @SerializedName("accountType") val accountType: String,
    @SerializedName("alias") val alias: String,
    @SerializedName("isVisible") val isVisible: Boolean,
    @SerializedName("iban") val iban: String
) : Serializable