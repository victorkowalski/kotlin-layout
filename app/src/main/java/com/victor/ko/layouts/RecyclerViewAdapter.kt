package com.victor.ko.layouts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    var onItemClick: ((Contact) -> Unit)? = null
    var items: List<Contact> = emptyList()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]

        holder.email.text = contact.email
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val email: TextView = itemView.email

        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(items[adapterPosition])
            }
        }
    }
}
/*
ContactAdapter:

class ContactAdapter @Inject constructor() : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    var onItemClick: ((Contact) -> Unit)? = null
    var contacts: List<Contact> = emptyList()

    ...

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]

        holder.email.text = contact.email
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val email: TextView = itemView.email

        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(contacts[adapterPosition])
            }
        }
    }
}
//****************************************************
ContactActivity:

override fun setupRecyclerAdapter() {
    recyclerView.adapter = contactAdapter
    recyclerView.layoutManager = LinearLayoutManager(this)

    contactAdapter.onItemClick = { contact ->

        // do something with your item
        Log.d("TAG", contact.email)
    }
}
 */
