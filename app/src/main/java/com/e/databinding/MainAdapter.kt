package com.e.databinding

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.e.databinding.databinding.ItemMainBinding

class MainAdapter(private val userList : List<User>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val binding : ItemMainBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_main, parent, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindTo(userList[position])
    }


    class ViewHolder(private val binding: ItemMainBinding): RecyclerView.ViewHolder(binding.root) {
        fun bindTo(user: User) {
            binding.userModel = user
        }

    }
}
