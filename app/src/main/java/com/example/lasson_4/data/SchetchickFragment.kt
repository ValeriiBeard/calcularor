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

        _binding!!.btSchet.setOnClickListener {}
        fun onClickSchet(view: View) {
            val i = Intent(requireContext(), MainActivity::class.java)

        }

    }
}


