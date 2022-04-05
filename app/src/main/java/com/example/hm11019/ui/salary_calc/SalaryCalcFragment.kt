package com.example.hm11019.ui.salary_calc

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hm11019.R

class SalaryCalcFragment : Fragment() {

    companion object {
        fun newInstance() = SalaryCalcFragment()
    }

    private lateinit var viewModel: SalaryCalcViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.salary_calc_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SalaryCalcViewModel::class.java)
        // TODO: Use the ViewModel
    }

}