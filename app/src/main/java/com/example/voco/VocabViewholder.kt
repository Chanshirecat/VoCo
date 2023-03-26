package com.example.voco

import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class VocabViewholder (view: View, private val onEditClick: EditClick, private val onDeleteClick: DeleteClick): RecyclerView.ViewHolder(view)
{
    private val card: CardView
    init{
        card = view as CardView
    }

    fun display(animalName: String) {
        // For the text, we simply write it to the buttons text-property.
        card.KoreanText = koreanText

        card.setOnClickListener {
            onEditClick(koreanText, englishText)
        }
    }



}