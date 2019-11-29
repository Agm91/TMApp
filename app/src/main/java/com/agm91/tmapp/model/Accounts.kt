package com.agm91.tmapp.model

import com.google.gson.annotations.SerializedName

data class Accounts(
    @SerializedName("accounts") val accounts: List<Account>,
    @SerializedName("failedAccountTypes") val failedAccountTypes: String,
    @SerializedName("returnCode") val returnCode: String
)