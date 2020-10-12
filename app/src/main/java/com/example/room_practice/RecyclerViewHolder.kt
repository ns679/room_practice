package com.example.room_practice

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewHolder(view: View):RecyclerView.ViewHolder(view){
    val itemTextView:TextView = view.findViewById(R.id.item_text_view)
}
