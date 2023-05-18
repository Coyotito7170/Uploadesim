package com.example.uploadesim

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PlacesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PlacesFragment : Fragment() {
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

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_places, container, false)
        val btnDstv = view.findViewById<Button>(R.id.mBtnDstv)
        //val btnYoutube = view.findViewById<Button>(R.id.mBtnYoutube)
        //val btnGotv = view.findViewById<Button>(R.id.mBtnGotv)
        //val btnMovies = view.findViewById<Button>(R.id.mBtnMovies)
        //val btnNtsa = view.findViewById<Button>(R.id.mBtnNtsa)
        //val btnolt = view.findViewById<Button>(R.id.mBtnBolt)
        //val btnRubis = view.findViewById<Button>(R.id.mBtnRubis)
        //val btnKopa = view.findViewById<Button>(R.id.mBtnKopa)
        //val btnInsurance = view.findViewById<Button>(R.id.mBtnInsurance)
        btnDstv.setOnClickListener {
            var jaribu = Intent(context,DstvActivity::class.java)
            startActivity(jaribu)
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
         * @return A new instance of fragment PlacesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PlacesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}