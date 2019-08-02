package com.ebartmedia.ejobs.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import com.ebartmedia.ejobs.Model.Categories
import com.ebartmedia.ejobs.R

class CategoriesAdapter(internal var context:Context, internal var categories: List<Categories>): RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CategoriesViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.categories_layout, parent, false)

        return CategoriesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
       holder.txt_cat.text = categories[position].category_name.toString()
    }

}