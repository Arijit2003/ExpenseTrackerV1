package com.example.expensetrackerv1.ui.home.fragments.newrecord

interface ButtonListener {
    fun handleDateClick()
    fun handleError(msg:String)
    fun showProgressDialog()
    fun hideProgressDialog()
    fun goBack()
    fun goTwoStepBack()
}