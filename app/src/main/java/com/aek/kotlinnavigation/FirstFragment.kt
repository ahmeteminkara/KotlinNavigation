package com.aek.kotlinnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.aek.kotlinnavigation.databinding.FragmentFirstBinding
import java.util.Calendar

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val time = Calendar.getInstance().time.toString()

        binding.firstFragmentButton.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(time)
            Navigation.findNavController(it).navigate(action)
        }
    }
}
