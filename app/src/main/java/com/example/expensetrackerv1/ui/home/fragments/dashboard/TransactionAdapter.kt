package com.example.expensetrackerv1.ui.home.fragments.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView

import androidx.recyclerview.widget.RecyclerView
import com.example.expensetrackerv1.R
import com.example.expensetrackerv1.ui.home.dataclass.Transaction

class TransactionAdapter(
     val items: List<Transaction>,
     private val onItemClick: (Transaction) -> Unit
): RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.transaction_item, parent, false)
        return TransactionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val item = items[position]
        holder.descriptionTV.text=item.transactionDescription
        holder.amountTV.text=item.transactionAmount
        holder.typeTV.text = item.transactionType
        holder.dateTV.text = item.transactionDate
        holder.cardView.setOnClickListener{
            onItemClick(item)
        }

    }



    inner class TransactionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val descriptionTV:TextView = itemView.findViewById(R.id.transactionDescriptionItemTV)
        val amountTV:TextView = itemView.findViewById(R.id.transactionAmountItemTV)
        val typeTV:TextView  = itemView.findViewById(R.id.transactionTypeItemTV)
        val dateTV:TextView  = itemView.findViewById(R.id.transactionDateItemTV)
        val cardView:CardView = itemView.findViewById(R.id.transactionItemRoot)
    }
}