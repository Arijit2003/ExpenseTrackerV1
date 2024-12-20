package com.example.expensetrackerv1.ui.home.dataclass
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import java.util.UUID

@Parcelize
data class Transaction(
    var transactionDate:String?=null,
    var transactionType:String?=null,
    var transactionAmount: String?=null,
    var transactionDescription: String?=null,
    var transactionId:String=UUID.randomUUID().toString()
) : Parcelable