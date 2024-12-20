package com.example.expensetrackerv1.data.repositories

import android.util.Log

import androidx.lifecycle.MutableLiveData
import com.example.expensetrackerv1.ui.home.dataclass.Transaction
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.SetOptions


class TransactionRepository {
    var transactionListMutableLiveData: MutableLiveData<List<Transaction>>? = null
    private var snapshotListener: ListenerRegistration? = null
    var mFirestore: FirebaseFirestore? = null

    init {
        this.transactionListMutableLiveData =  MutableLiveData()
        mFirestore = FirebaseFirestore.getInstance();
    }

    fun getTransactionList():MutableLiveData<List<Transaction>> {
        fetchTransactions()
        return transactionListMutableLiveData!!
    }


    fun addTransaction(transaction: Transaction, resultLiveData: MutableLiveData<Boolean>){
        mFirestore!!.collection("transaction")
            .document(transaction.transactionId)
            .set(transaction)
            .addOnSuccessListener { documentReference ->
                resultLiveData.postValue(true)
            }
            .addOnFailureListener { e ->
                resultLiveData.postValue(false)
            }
    }

    fun updateTransaction(transaction: Transaction){
        mFirestore!!.collection("transaction").document(transaction.transactionId)
            .set(transaction, SetOptions.merge())
            .addOnSuccessListener {
                Log.d("Firestore", "Transaction object updated successfully!")
            }
            .addOnFailureListener { e ->
                Log.w("Firestore", "Error updating transaction object", e)
            }
    }


    private fun fetchTransactions() {
        snapshotListener = mFirestore!!.collection("transaction")
            .addSnapshotListener { querySnapshot, firebaseFirestoreException ->
                if (firebaseFirestoreException != null) return@addSnapshotListener
                val transactionList = mutableListOf<Transaction>()
                querySnapshot?.forEach { document ->
                    transactionList.add(document.toObject(Transaction::class.java))
                }
                transactionListMutableLiveData?.postValue(transactionList)
            }
    }


    fun removeTransaction(transaction: Transaction) {
        mFirestore!!.collection("transaction")
            .document(transaction.transactionId)
            .delete()
            .addOnSuccessListener {
                Log.d("TransactionRepository","Item Removed")
            }
            .addOnFailureListener { e ->
                Log.e("TransactionRepository", "Error removing transaction")
            }
    }



    fun stopListening() {
        snapshotListener?.remove()
    }
}