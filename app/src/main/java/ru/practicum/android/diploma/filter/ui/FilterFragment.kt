package ru.practicum.android.diploma.filter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import ru.practicum.android.diploma.R
import ru.practicum.android.diploma.databinding.FragmentFilterBinding

class FilterFragment : Fragment() {

    private var _binding: FragmentFilterBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFilterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.placeOfJob.setOnClickListener {
            findNavController().navigate(R.id.action_filterFragment_to_placeSelectorFragment)
        }
        binding.branchOfJob.setOnClickListener {
            findNavController().navigate(R.id.action_filterFragment_to_branchFragment)
        }
        setFragmentResultListener("requestKey") { requestKey, bundle ->
            val country = bundle.getString("countryKey")
            val region = bundle.getString("regionKey")
            val branch = bundle.getString("branchKey")
        }
    }
}
