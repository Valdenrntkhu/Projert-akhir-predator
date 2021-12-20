package com.predator.tugasakhir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.predator.tugasakhir.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAssaultRifleAdapter(private val listAssaultRifle: ArrayList<AssaultRifle>) : RecyclerView.Adapter<ListAssaultRifleAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list_assaultr, viewGroup,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val assaultr = listAssaultRifle[position]

        Glide.with(holder.itemView.context)
            .load(assaultr.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = assaultr.name

        holder.itemView.setOnClickListener {onItemClickCallback.onItemClicked(listAssaultRifle[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listAssaultRifle.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: AssaultRifle)
    }
}