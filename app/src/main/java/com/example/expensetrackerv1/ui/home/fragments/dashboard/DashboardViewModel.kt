package com.example.expensetrackerv1.ui.home.fragments.dashboard

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.expensetrackerv1.data.repositories.TransactionRepository
import com.example.expensetrackerv1.ui.home.dataclass.Transaction

class DashboardViewModel : ViewModel() {
    var btnListener: ButtonListener?=null
    private lateinit var _transactionList: MutableLiveData<List<Transaction>>
    lateinit var  transactionList: LiveData<List<Transaction>>
    private lateinit var repository:TransactionRepository


    init {
        repository =  TransactionRepository()
        _transactionList=repository.getTransactionList()
        transactionList=_transactionList
    }

    fun onAddNewBtnClick(view: View){
        btnListener?.changeFragment()
    }
    override fun onCleared() {
        super.onCleared()
        repository.stopListening()
    }
    fun removeTransaction(transaction: Transaction) {
        repository.removeTransaction(transaction)
    }

}