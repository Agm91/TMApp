package com.agm91.tmapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.agm91.tmapp.model.Accounts
import com.agm91.tmapp.repo.AccountsRepository

class AccountsViewModel : ViewModel() {
    private val repository = AccountsRepository()

    fun getAccounts(): LiveData<Accounts> {
        return repository.getAccounts()
    }
}