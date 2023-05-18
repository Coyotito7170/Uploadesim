package com.example.uploadesim

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MusicFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MusicFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =inflater.inflate(R.layout.fragment_music, container, false)
        val tvKcb = view.findViewById<TextView>(R.id.mTvKcb)
        val tvEquity = view.findViewById<TextView>(R.id.mTvEquity)
        val tvAbsa = view.findViewById<TextView>(R.id.mTvAbsa)
        val tvDtb = view.findViewById<TextView>(R.id.mTvDtb)


        tvKcb.setOnClickListener {
            var okoa = Intent(context,KcbActivity::class.java)
            startActivity(okoa)
        }
        tvAbsa.setOnClickListener {
            var faulu = Intent(context,AbsaActivity::class.java)
            startActivity(faulu)
        }
        tvEquity.setOnClickListener {
            var biashara = Intent(context,EquityActivity::class.java)
            startActivity(biashara)
        }
        tvDtb.setOnClickListener {
            var majuu = Intent(context,DtbActivity::class.java)
            startActivity(majuu)
        }


        return view

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MusicFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MusicFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}