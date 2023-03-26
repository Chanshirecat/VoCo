package com.example.voco

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VocabAdapter (
    private var cardNames: List<String>,
    private val onCardClick: CardClickFunction)
: RecyclerView.Adapter<VocabViewHolder>() {

    fun addVocab(cardName: String) {
        cardNames = cardNames.plus(cardName)

        val position = cardNames.count() - 1
        this.notifyItemInserted(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VocabViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.card_layout, parent, false)
        return VocabViewholder(view, onCardClick)
    }

    override fun onBindViewHolder(holder: VocabViewHolder, position: Int) {
        val cardName = cardNames[position]
        holder.display(cardName)
    }

    override fun getItemCount(): Int {
        return cardNames.count()
    }
}