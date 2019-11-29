package com.agm91.tmapp.repo

import androidx.lifecycle.MutableLiveData
import com.agm91.tmapp.model.Accounts
import com.agm91.tmapp.util.Dummy

class AccountsRepository {
    private var data = MutableLiveData<Accounts>()

    fun getAccounts(): MutableLiveData<Accounts> {
        data.value = Dummy.getAccounts()

        return data
    }
}