package com.e.databinding

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MainAdapter(private val userList : List<User>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent,false))
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindTo(userList[position])
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val name = view.findViewById<TextView>(R.id.tv_name)
        private val weight = view.findViewById<TextView>(R.id.tv_weight)
        fun bindTo(user: User) {
            name.text = user.name
            weight.text = user.weight
        }

    }
}
