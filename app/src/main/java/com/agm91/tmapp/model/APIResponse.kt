package com.agm91.tmapp.model

data class APIResponse<T>(val data: T?, val error: Throwable?)