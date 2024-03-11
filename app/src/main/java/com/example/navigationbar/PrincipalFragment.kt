package com.example.navigationbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.navigationbar.databinding.FragmentPrincipalBinding


class PrincipalFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentPrincipalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPrincipalBinding.inflate(inflater,
            container, false)
        binding.btnBuscar.setOnClickListener(this)
        return binding.root
    }

    override fun onClick(p0: View?) {
        Toast.makeText(requireContext(), binding.etnombre.text.toString(),
            Toast.LENGTH_LONG).show()
    }

}