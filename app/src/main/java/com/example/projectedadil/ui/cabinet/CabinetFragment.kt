package com.example.projectedadil.ui.breakfast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.projectedadil.R

class CabinetFragment : Fragment() {

    private lateinit var freeViewModel: FreeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        freeViewModel =
                ViewModelProviders.of(this).get(FreeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_free, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        freeViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}