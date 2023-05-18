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
 * Use the [NewsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewsFragment : Fragment() {
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
        var view =  inflater.inflate(R.layout.fragment_news, container, false)
        val btnCallSupport = view.findViewById<Button>(R.id.mBtnCallSupport)
        val btnNetworkProvider = view.findViewById<Button>(R.id.mBtnNetworkProvider)
        val btnSms = view.findViewById<Button>(R.id.mBtnSms)
        val btnEmail = view.findViewById<Button>(R.id.mBtnEmail)
        val btnFacebook = view.findViewById<Button>(R.id.mBtnFacebook)
        val btnInstagram = view.findViewById<Button>(R.id.mBtnInstagram)
        val btnYoutube = view.findViewById<Button>(R.id.mBtnYoutube)
        val btnShare = view.findViewById<Button>(R.id.mBtnShare)
        val btnLogout = view.findViewById<Button>(R.id.mBtnLogOut)
        val btnSpending = view.findViewById<Button>(R.id.mBtnSpending)


        btnCallSupport.setOnClickListener {
            var piga = Intent(context,ProfileActivity::class.java)
            startActivity(piga)
        }
        btnEmail.setOnClickListener {
            var piga = Intent(context,ProfileActivity::class.java)
            startActivity(piga)
        }
        btnFacebook.setOnClickListener {
            var piga = Intent(context,ProfileActivity::class.java)
            startActivity(piga)
        }
        btnInstagram.setOnClickListener {
            var piga = Intent(context,ProfileActivity::class.java)
            startActivity(piga)
        }
        btnShare.setOnClickListener {
            var piga = Intent(context,ProfileActivity::class.java)
            startActivity(piga)
        }
        btnLogout.setOnClickListener {
            var piga = Intent(context,LoginActivity::class.java)
            startActivity(piga)
        }
        btnSms.setOnClickListener {
            var piga = Intent(context,ProfileActivity::class.java)
            startActivity(piga)
        }
        btnSpending.setOnClickListener {
            var piga = Intent(context,ProfileActivity::class.java)
            startActivity(piga)
        }
        btnYoutube.setOnClickListener {
            var piga = Intent(context,ProfileActivity::class.java)
            startActivity(piga)
        }
        btnNetworkProvider.setOnClickListener {
            var piga = Intent(context,ProfileActivity::class.java)
            startActivity(piga)
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
         * @return A new instance of fragment NewsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NewsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}