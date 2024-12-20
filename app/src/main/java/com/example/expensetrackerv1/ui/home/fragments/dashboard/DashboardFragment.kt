package com.example.expensetrackerv1.ui.home.fragments.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expensetrackerv1.R
import com.example.expensetrackerv1.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment(),ButtonListener {


    private lateinit var viewModel:DashboardViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TransactionAdapter
    private lateinit var binding:FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_dashboard, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner  // To observe LiveData, if used
        viewModel.btnListener=this
        recyclerView=binding.dashboardRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        viewModel.transactionList.observe(viewLifecycleOwner) { dataList ->
            adapter = TransactionAdapter(dataList){data->
                val bundle = Bundle().apply {
                    putParcelable("transactionData", data)
                }

                findNavController().navigate(R.id.action_dashboardFragment_to_viewRecordFragment2,bundle)
            }
            recyclerView.adapter = adapter
        }
        setUpSwipeToDelete()
        return binding.root
    }


    override fun changeFragment() {
        findNavController().navigate(R.id.action_dashboardFragment_to_newRecordFragment)
    }


    private fun setUpSwipeToDelete() {
        val itemTouchHelperCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
            override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                val transactionToRemove = adapter.items[position]
                viewModel.removeTransaction(transactionToRemove)
            }
        }
        val itemTouchHelper = ItemTouchHelper(itemTouchHelperCallback)
        itemTouchHelper.attachToRecyclerView(binding.dashboardRecyclerView)
    }


}