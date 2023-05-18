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
 * Use the [FavFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FavFragment : Fragment() {
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
        var view =  inflater.inflate(R.layout.fragment_fav, container, false)
        val tvFinancialServices = view.findViewById<TextView>(R.id.mTvFinancialServices)
        val btnTransport = view.findViewById<TextView>(R.id.mBtnTransport)
        val btnEducation = view.findViewById<TextView>(R.id.mBtnEducation)
        val btnGas = view.findViewById<TextView>(R.id.mBtnGas)
        val btnNews = view.findViewById<TextView>(R.id.mBtnNews)
        val btnEntertainment = view.findViewById<TextView>(R.id.mBtnEntertainment)
        val btnServices = view.findViewById<TextView>(R.id.mBtnServices)
        val btnShops = view.findViewById<TextView>(R.id.mBtnShops)
        val btnHealth = view.findViewById<TextView>(R.id.mBtnHealth)
        val btnUpload = view.findViewById<TextView>(R.id.mBtnUpload)
        val tvProfile = view.findViewById<TextView>(R.id.mTvProfile)
        tvFinancialServices.setOnClickListener {
            var tembea = Intent(context,FinancialActivity::class.java)
            startActivity(tembea)
        }
        btnTransport.setOnClickListener {
            var kimbia = Intent(context,TravelActivity::class.java)
            startActivity(kimbia)
        }
        btnEducation.setOnClickListener {
            var ona = Intent(context,EducationActivity::class.java)
            startActivity(ona)
        }
        btnGas.setOnClickListener {
            var fikiria = Intent(context,GasActivity::class.java)
            startActivity(fikiria)
        }
        btnEntertainment.setOnClickListener {
            var kili = Intent(context,EntertainmentActivity::class.java)
            startActivity(kili)
        }
        btnHealth.setOnClickListener {
            var pona = Intent(context,HealthActivity::class.java)
            startActivity(pona)
        }
        btnNews.setOnClickListener {
            var habari = Intent(context,NewsActivity::class.java)
            startActivity(habari)
        }
        btnServices.setOnClickListener {
            var wakilisha = Intent(context,LocalActivity::class.java)
            startActivity(wakilisha)
        }
        btnShops.setOnClickListener {
            var nunua = Intent(context,ShopsActivity::class.java)
            startActivity(nunua)
        }
        btnUpload.setOnClickListener {
            var uplodi = Intent(context,UploadActivity::class.java)
            startActivity(uplodi)
        }
        tvProfile.setOnClickListener {
            var account = Intent(context,ProfileActivity::class.java)
            startActivity(account)
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
         * @return A new instance of fragment FavFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FavFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}

