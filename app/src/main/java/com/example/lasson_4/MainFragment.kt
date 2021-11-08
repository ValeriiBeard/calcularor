package com.example.lasson_4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelLazy
import androidx.navigation.findNavController
import com.example.lasson_4.data.Car
import com.example.lasson_4.data.Tank
import com.example.lasson_4.data.dataCar
import com.example.lasson_4.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val dataCartest : dataCar by activityViewModels()
    private val binding: FragmentMainBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var userDatatest= binding.probegCarDay.text.toString().toFloat()

        binding.btSave.setOnClickListener {
            dataCartest.dataCartest.value = userDatatest
        }

        logD("Valera ")
        val tank1 = Tank(12f)
        val tank2 = Tank(35f)




        binding.counterNavigation.setOnClickListener {
            val action =
                MainFragmentDirections
                    .actionMainFragmentToCounterFragment()
            view.findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}