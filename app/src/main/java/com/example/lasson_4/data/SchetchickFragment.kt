package com.example.lasson_4.data

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lasson_4.MainActivity
import com.example.lasson_4.databinding.FragmentSchetchickBinding

class SchetchickFragment : Fragment() {
    val titleProbeg: String = "введіть пробіг"

    private var _binding: FragmentSchetchickBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSchetchickBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var nameCar = "Honda AA 00 11 AA"
        var gasStart: Float = 15.6f
        var startProbeg = 168555
        var basNormCar: Float = 8.6f
        var rozhodDayCar: Float? = null

//        var honda = Car ()

        _binding!!.btSchet.setOnClickListener {}
        fun onClickSchet(view: View) {
            val i = Intent(requireContext(), MainActivity::class.java)

        }
//        var userStyProbeg


        fun schchetchikDay() {
//            userStyProbeg = honda.probegDayCityt
//            honda.probegDayStart = startProbeg
//            honda.probegDayFinish = honda.probegDayStart+ honda.probegDayCityt

        }

        _binding!!.nameCar.text = nameCar
        _binding!!.gasCar.text = "$gasStart"
        _binding!!.probegCar.text = "$startProbeg"
        _binding!!.probegDay.hint = titleProbeg
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    private fun Car(): Car {
//    }
}