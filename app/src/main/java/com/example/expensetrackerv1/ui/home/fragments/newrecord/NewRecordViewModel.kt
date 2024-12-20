package com.example.expensetrackerv1.ui.home.fragments.newrecord

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.expensetrackerv1.data.repositories.TransactionRepository
import com.example.expensetrackerv1.ui.home.dataclass.Transaction

class NewRecordViewModel : ViewModel() {


    private lateinit var repository: TransactionRepository
    private val _transactionUploadResult = MutableLiveData<Boolean>()
    val transactionUploadResult: LiveData<Boolean> get() = _transactionUploadResult

    var buttonListener:ButtonListener?=null
    var selectedDate:String?=null
    var description:String?=null
    var transactionType:String?=null
    var transactionAmount:String?=null

    init {
        repository= TransactionRepository()
    }



    fun setTheTransactionType(type:String){
        transactionType=type
    }
    fun setTheSelectedDate(date: String) {
       selectedDate= date
    }
    fun onDateClick(view:View){
        buttonListener?.handleDateClick()
    }

    fun onClickSave(view:View){
        if(selectedDate==null || description==null ||transactionType==null ||transactionAmount==null
            ||selectedDate==""||description==""|| transactionType==""||transactionAmount==""){
            buttonListener?.handleError("Fields should not be empty")
            return
        }
        var transaction:Transaction
        if(NewRecordFragment.transaction!=null) {
            transaction = Transaction(selectedDate, transactionType, transactionAmount, description, NewRecordFragment.transaction!!.transactionId)
            buttonListener?.showProgressDialog()
            repository.updateTransaction(transaction)
            buttonListener?.hideProgressDialog()
            buttonListener?.goTwoStepBack()

        }else {
            transaction = Transaction(selectedDate, transactionType, transactionAmount, description)
            buttonListener?.showProgressDialog()
            repository.addTransaction(transaction, _transactionUploadResult)
        }
    }
    fun onBackButtonPressed(view:View){
        buttonListener?.goBack()
    }

}