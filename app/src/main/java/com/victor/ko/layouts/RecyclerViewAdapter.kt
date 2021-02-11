package com.victor.ko.layouts

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(
    private val items: List<DataModel>, private val onClick: (DataModel) -> Unit
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    //var items: List<DataModel> = emptyList()

    class ViewHolder(itemView: View, val onClick: (DataModel) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        private val textView: TextView = itemView.findViewById(R.id.textView)
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val relativeLayout: RelativeLayout = itemView.findViewById(R.id.relativeLayout)

        //private val relativeLayout = itemView.findViewById(R.id.linearLayout) as RelativeLayout?
        private var currentDataModel: DataModel? = null

        init {
            itemView.setOnClickListener {
                currentDataModel?.let {
                    onClick(it)
                }
            }
        }

        fun bind(dataModel: DataModel) {
            currentDataModel = dataModel

            textView.text = dataModel.text
            imageView.setImageResource(dataModel.drawable)
            relativeLayout.setBackgroundColor(Color.parseColor(dataModel.color))
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(view, onClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

/*
    var onItemClick: ((DataModel) -> Unit)? = null
    var items: List<DataModel> = emptyList()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        //holder.email.text = contact.email
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(itemView) {
        //val email: TextView = itemView.email
        var textView: TextView? = null
        var imageView: ImageView? = null
        var relativeLayout: RelativeLayout? = null
        var item: DataModel? = null

        init {
            textView = v.textView
            imageView = v.findViewById<View>(R.id.imageView)
            relativeLayout = v.findViewById<View>(R.id.relativeLayout)

            itemView.setOnClickListener {
                onItemClick?.invoke(items[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}*/
/*
class FlowersAdapter(private val onClick: (Flower) -> Unit) :
    ListAdapter<Flower, FlowersAdapter.FlowerViewHolder>(FlowerDiffCallback) {

    /* ViewHolder for Flower, takes in the inflated view and the onClick behavior. */
    class FlowerViewHolder(itemView: View, val onClick: (Flower) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        private val flowerTextView: TextView = itemView.findViewById(R.id.flower_text)
        private val flowerImageView: ImageView = itemView.findViewById(R.id.flower_image)
        private var currentFlower: Flower? = null

        init {
            itemView.setOnClickListener {
                currentFlower?.let {
                    onClick(it)
                }
            }
        }

        /* Bind flower name and image. */
        fun bind(flower: Flower) {
            currentFlower = flower

            flowerTextView.text = flower.name
            if (flower.image != null) {
                //flowerImageView.setImageResource(flower.image)
                //flowerImageView.setImageResource(R.drawable.daisy)
            } else {
                flowerImageView.setImageResource(R.drawable.rose)
            }
        }
    }

    /* Creates and inflates view and return FlowerViewHolder. */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.flower_item, parent, false)
        return FlowerViewHolder(view, onClick)
    }

    /* Gets current flower and uses it to bind view. */
    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        val flower = getItem(position)
        holder.bind(flower)

    }
}

object FlowerDiffCallback : DiffUtil.ItemCallback<Flower>() {
    override fun areItemsTheSame(oldItem: Flower, newItem: Flower): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Flower, newItem: Flower): Boolean {
        return oldItem.id == newItem.id
    }
}
 */
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
}*/

/*
ContactActivity:

override fun setupRecyclerAdapter() {
    recyclerView.adapter = contactAdapter
    recyclerView.layoutManager = LinearLayoutManager(this)

    contactAdapter.onItemClick = { contact ->

        // do something with your item
        Log.d("TAG", contact.email)
    }
}*/