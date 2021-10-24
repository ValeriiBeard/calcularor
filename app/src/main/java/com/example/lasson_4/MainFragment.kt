package com.example.lasson_4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.lasson_4.data.Car
import com.example.lasson_4.data.Tank
import com.example.lasson_4.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
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
        logD("Valera")
        val tank1 = Tank(12f)
        val tank2 = Tank(35f)
        val car: Car = Car(25, 12, 34, tank2)


        binding.btSave.setOnClickListener {

            var classCar = Car(1,1,1,tank1,)
            var userDataN = binding.btSave.text.toString().toBigDecimal()
        }



        binding.counterNavigation.setOnClickListener {
            val probegVecherom = car.probegVecherom()

        }

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