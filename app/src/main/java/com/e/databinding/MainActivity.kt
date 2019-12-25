package com.e.databinding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {

        Toast.makeText(this, "View Clicked",Toast.LENGTH_SHORT).show()

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = MainAdapter(userList(), this)


    }

    private fun userList(): List<User> {
        val userList = ArrayList<User>()
        userList.add(User("Bismah", "61"))
        userList.add(User("Yawar", "54"))
        return userList
    }
}
