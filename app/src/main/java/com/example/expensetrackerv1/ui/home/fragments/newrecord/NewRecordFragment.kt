package com.example.expensetrackerv1.ui.home.fragments.newrecord

import android.app.DatePickerDialog
import android.app.ProgressDialog
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.expensetrackerv1.R
import com.example.expensetrackerv1.databinding.FragmentNewRecordBinding
import com.example.expensetrackerv1.ui.home.dataclass.Transaction
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class NewRecordFragment : Fragment(),ButtonListener {
    private lateinit var viewModel: NewRecordViewModel
    private lateinit var  binding:FragmentNewRecordBinding
    private lateinit var progressDialog:ProgressDialog
    companion object{
        var transaction:Transaction?=null
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        viewModel= ViewModelProvider(this).get(NewRecordViewModel::class.java)
        binding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_new_record, container, false)
        binding.viewModel=viewModel
        viewModel.buttonListener=this
        binding.lifecycleOwner = viewLifecycleOwner
        transaction = arguments?.getParcelable<Transaction>("transactionData")
        transaction?.let {
            binding.radioGroup.check(if (it.transactionType=="Expense")R.id.radioBtnExpense else R.id.radioBtnIncome)
            binding.dateEditText.text = Editable.Factory.getInstance().newEditable(it.transactionDate)
            viewModel.transactionType=it.transactionType
            viewModel.selectedDate=it.transactionDate
            viewModel.description=it.transactionDescription
            viewModel.transactionAmount=it.transactionAmount
        }

        binding.radioGroup.setOnCheckedChangeListener{ group,checkedId->
            if(checkedId==R.id.radioBtnIncome){
                viewModel.setTheTransactionType(binding.radioBtnIncome.text.toString())
            }else{
                viewModel.setTheTransactionType(binding.radioBtnExpense.text.toString())
            }
        }
        createProgressDialog()
        viewModel.transactionUploadResult.observe(viewLifecycleOwner,Observer{ success->
            hideProgressDialog()
            if (success) setFieldsEmpty()
            else Toast.makeText(requireContext(), "Failed to upload transaction. Please try again.", Toast.LENGTH_SHORT).show()
        })
        return binding.root
    }

    override fun handleDateClick() {
        openDatePicker()
    }

    fun createProgressDialog(){
        progressDialog=ProgressDialog(requireContext())
        progressDialog.setMessage("Uploading Transaction...")
        progressDialog.setCancelable(false)
    }
    fun setFieldsEmpty(){
        viewModel.transactionType=null
        viewModel.selectedDate=null
        viewModel.description=null
        viewModel.transactionAmount=null
        binding.radioGroup.clearCheck()
        binding.dateEditText.text=null
        binding.descEditText.text=null
        binding.amountEditText.text=null
    }

    override fun handleError(msg: String) {
        Toast.makeText(requireContext(),msg,Toast.LENGTH_SHORT).show()
    }

    override fun showProgressDialog() {
        progressDialog.show()
    }

    override fun hideProgressDialog() {
        progressDialog.dismiss()
    }

    override fun goBack() {
        findNavController().navigateUp()
    }

    override fun goTwoStepBack() {
        findNavController().popBackStack()
        findNavController().navigateUp()
    }


    private fun openDatePicker() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val datePickerDialog = DatePickerDialog(
            requireContext(),
            { _, selectedYear, selectedMonth, selectedDay ->
                val selectedDate = Calendar.getInstance()
                selectedDate.set(selectedYear, selectedMonth, selectedDay)
                val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
                val formattedDate = dateFormat.format(selectedDate.time)
                viewModel.setTheSelectedDate(formattedDate)
                binding.dateEditText.text= Editable.Factory.getInstance().newEditable(formattedDate)
            },
            year,month, day)
        datePickerDialog.show()
    }
}