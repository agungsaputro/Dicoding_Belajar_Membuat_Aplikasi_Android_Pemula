package com.amartadev.androidpemulanaruto

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ListNarutoAdapter(private val listNaruto:ArrayList<Naruto>): RecyclerView.Adapter<ListNarutoAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_naruto, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listNaruto.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, photo, detail) = listNaruto[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvDetail.text = detail

        val mContext = holder.itemView.context
        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext,DetailActivity::class.java )
            moveDetail.putExtra(DetailActivity.EXTRA_NAME,name)
            moveDetail.putExtra(DetailActivity.EXTRA_PHOTO,photo)
            moveDetail.putExtra(DetailActivity.EXTRA_DESCRIPTION,detail)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name_naruto)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail_naruto)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_naruto)
    }

}