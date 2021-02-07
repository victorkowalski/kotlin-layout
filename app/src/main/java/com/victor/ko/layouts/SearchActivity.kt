package com.victor.ko.layouts

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.victor.ko.layouts.databinding.ActivitySearchBinding

//import com.victor.ko.layouts.databinding.

class SearchActivity : AppCompatActivity(){

    private lateinit var bnd: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bnd = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(bnd.root)

        val recyclerView = bnd.myRecycleView
        val adapter = RecyclerViewAdapter(Data.getObjects()/*, ::adapterOnClick*/) //thisClass::adapterOnClick

        recyclerView.adapter = adapter

        /**
         * AutoFitGridLayoutManager that auto fits the cells by the column width defined.
         */
        val layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        //val manager = GridLayoutManager(activity, 3, GridLayoutManager.VERTICAL, false)
    }

    private fun adapterOnClick(item: DataModel) {
        Toast.makeText(applicationContext, item.text.toString() + " is clicked", Toast.LENGTH_SHORT)
            .show()
    }
}