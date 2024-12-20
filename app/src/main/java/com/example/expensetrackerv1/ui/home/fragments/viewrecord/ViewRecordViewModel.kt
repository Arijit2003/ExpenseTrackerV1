package com.example.expensetrackerv1.ui.home.fragments.viewrecord

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.expensetrackerv1.data.repositories.TransactionRepository
import com.example.expensetrackerv1.ui.home.dataclass.Transaction

class ViewRecordViewModel : ViewModel() {
    var buttonListener: ButtonListener?=null
    private lateinit var repository: TransactionRepository

    init {
        repository =  TransactionRepository()
    }

    fun onBackButtonPressed(view: View){
        buttonListener?.goBack()
    }
    fun onEditButtonPressed(view: View){
        buttonListener?.edit()
    }
    fun onDeleteButtonPressed(view: View){
        buttonListener?.delete()
    }
    fun removeTransaction(transaction: Transaction) {
        repository.removeTransaction(transaction)
    }
}