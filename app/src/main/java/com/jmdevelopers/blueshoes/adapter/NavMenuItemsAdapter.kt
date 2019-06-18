package com.jmdevelopers.blueshoes.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.jmdevelopers.blueshoes.R
import com.jmdevelopers.blueshoes.domain.NavMenuItem

class NavMenuItemsAdapter(val items: List<NavMenuItem>) : RecyclerView.Adapter<NavMenuItemsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, type: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.nav_menu_item, parent, false)
        return ViewHolder(layout)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(parent: ViewHolder, position: Int) {
        parent.setdata(items[position])
    }


    // classe interna
    inner class ViewHolder(itemvew: View) : RecyclerView.ViewHolder(itemvew) {
        private val iv_icon: ImageView = itemvew.findViewById(R.id.iv_icon)
        private val tv_label: TextView = itemvew.findViewById(R.id.tv_label)
        fun setdata(item: NavMenuItem) {
            tv_label.text = item.label
            // se nao tiver icone ele seta
            if (item.iconid != NavMenuItem.DEFALT_ICON_ID) {
                iv_icon.setImageResource(item.iconid)
                iv_icon.visibility = View.VISIBLE
            } else {
                iv_icon.visibility = View.GONE
            }


        }
    }
}