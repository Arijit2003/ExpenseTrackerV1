package com.example.expensetrackerv1.ui.home.fragments.viewrecord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.expensetrackerv1.R
import com.example.expensetrackerv1.databinding.FragmentViewRecordBinding
import com.example.expensetrackerv1.ui.home.dataclass.Transaction


class ViewRecordFragment : Fragment(),ButtonListener {

    private lateinit var viewModel: ViewRecordViewModel
    private lateinit var binding: FragmentViewRecordBinding
    private var transaction: Transaction?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(ViewRecordViewModel::class.java)
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_view_record, container, false)
        binding.viewmodel = viewModel
        viewModel.buttonListener=this
        binding.lifecycleOwner = viewLifecycleOwner
        transaction = arguments?.getParcelable<Transaction>("transactionData")
        transaction?.let {
            binding.viewRecordTranType.text = it.transactionType
            binding.viewRecordTranDate.text = it.transactionDate
            binding.viewRecordTranDesc.text = it.transactionDescription
            binding.viewRecordTranAmount.text=it.transactionAmount
        }
        return binding.root
    }

    override fun goBack() {
        findNavController().navigateUp()
    }

    override fun edit() {
        val bundle = Bundle().apply {
            putParcelable("transactionData", transaction)
        }
        findNavController().navigate(R.id.action_viewRecordFragment_to_newRecordFragment,bundle)
    }

    override fun delete() {
        viewModel.removeTransaction(transaction!!)
        goBack()
    }
}