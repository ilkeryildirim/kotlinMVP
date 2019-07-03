package com.ilkeryildirim.firstkotlin.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.ilkeryildirim.firstkotlin.Model.Marvel
import com.ilkeryildirim.firstkotlin.R
import kotlinx.android.synthetic.main.item_custom_layout.view.*


class RecyclerViewAdapter(heroList : List<Marvel>): RecyclerView.Adapter<HeroViewHolder>() {

    var heroList=heroList


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): HeroViewHolder {
        return HeroViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return heroList.size
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {

        val itemview: View =holder.itemView
        itemview.heroName2.text=heroList[position].name
        itemview.realName.text=heroList[position].realname
        itemview.bio.text=heroList[position].bio
        Glide.with(itemview).load(heroList[position].imageurl).into(itemview.heroImage)

    }
}

class HeroViewHolder(viewGroup : ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.from(viewGroup.context)
    .inflate(R.layout.item_custom_layout,viewGroup,false))



