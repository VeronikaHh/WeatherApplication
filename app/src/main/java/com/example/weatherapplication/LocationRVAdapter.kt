package com.example.weatherapplication

import android.content.Context
import android.text.method.TextKeyListener.clear
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LocationRVAdapter(val context: Context) :RecyclerView.Adapter<LocationRVAdapter.ViewHolder>(){

    private val allLocations = ArrayList<Location>()

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val cityTV = itemView.findViewById<TextView>(R.id.idTVLocation)
        val timeTV = itemView.findViewById<TextView>(R.id.idTVTime)
        val descriptionTV = itemView.findViewById<TextView>(R.id.idTVDescription)
        val tempTV = itemView.findViewById<TextView>(R.id.idTVTemp)
        val lowTempTV = itemView.findViewById<TextView>(R.id.idTVTempL)
        val highTempTV = itemView.findViewById<TextView>(R.id.idTVTempH)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.city_rv_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //TO DO: bind datato view holder from api

        holder.cityTV.setText(allLocations.get(position).city)
        holder.timeTV.setText(allLocations.get(position).locationTime)
        holder.descriptionTV.setText(allLocations.get(position).weatherDescroption)
        holder.tempTV.setText(allLocations.get(position).locationTempreture)
        holder.lowTempTV.setText(allLocations.get(position).locationLowTempreture)
        holder.highTempTV.setText(allLocations.get(position).locationHighTempreture)
    }

    override fun getItemCount(): Int {
        return allLocations.size
    }

    fun updateList(newList: List<Location>){
        //Location.clear()
        allLocations.addAll(newList)
        notifyDataSetChanged()
    }

}