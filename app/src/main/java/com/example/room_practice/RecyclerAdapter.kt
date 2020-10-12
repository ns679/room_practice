package com.example.room_practice

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter internal  constructor(context: Context):RecyclerView.Adapter<RecyclerViewHolder>(){

    private val inflater:LayoutInflater = LayoutInflater.from(context)
    private var words = emptyList<Word>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = inflater.inflate(R.layout.list_item_view,parent,false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val current = words[position]
        holder.itemTextView.text = current.word
    }

    internal fun setWords(word: List<Word>){
        this.words = words
        notifyDataSetChanged()
    }

    override fun getItemCount() = words.size

}


