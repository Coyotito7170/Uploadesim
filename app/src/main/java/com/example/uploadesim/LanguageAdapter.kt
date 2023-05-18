package com.example.uploadesim

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LanguageAdapter(var mList: List<FinancialData>):
    RecyclerView.Adapter<LanguageAdapter.FinancialViewHolder>() {

    inner class FinancialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val titleTv: TextView = itemView.findViewById(R.id.mTvNetflix)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FinancialViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FinancialViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}