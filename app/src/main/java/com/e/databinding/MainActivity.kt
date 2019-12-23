package com.e.databinding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = MainAdapter(userList())


    }

    private fun userList(): List<User> {
        val userList = ArrayList<User>()
        userList.add(User("Bismah", "61"))
        userList.add(User("Yawar", "54"))
        return userList
    }
}
