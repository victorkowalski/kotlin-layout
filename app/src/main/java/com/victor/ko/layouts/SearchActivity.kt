package com.victor.ko.layouts

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.victor.ko.layouts.databinding.ActivitySearchBinding

//import com.victor.ko.layouts.databinding.

class SearchActivity : AppCompatActivity(){

    private lateinit var bnd: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bnd = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(bnd.root)

        val recyclerView = bnd.myRecycleView
        val adapter = RecyclerViewAdapter(Data.getObjects(), ::adapterOnClick) //thisClass::adapterOnClick

        recyclerView.adapter = adapter

        /**
         * AutoFitGridLayoutManager that auto fits the cells by the column width defined.
         */
        //val layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        /**
         * AutoFitGridLayoutManager that auto fits the cells by the column width defined.
         */
        val layoutManager = AutoFitGridLayoutManager(this, 500)
        recyclerView.layoutManager = layoutManager

    }

    private fun adapterOnClick(item: DataModel) {
        Toast.makeText(applicationContext, item.text.toString() + " is clicked", Toast.LENGTH_SHORT)
            .show()
    }
}