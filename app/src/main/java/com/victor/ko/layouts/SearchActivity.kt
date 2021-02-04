package com.victor.ko.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.victor.ko.layouts.databinding.ActivitySearchBinding

//import com.victor.ko.layouts.databinding.

class SearchActivity : AppCompatActivity(){

    private lateinit var bnd: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bnd = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(bnd.root)

        val recyclerView = bnd.myRecycleView as RecyclerView
        //val adapter = RecyclerViRecyclerViewAdapterewAdapter(this, Data.getObjects(), this)
        //recyclerView.adapter = adapter
    }
}