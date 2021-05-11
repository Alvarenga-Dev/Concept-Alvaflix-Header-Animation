package com.alvarengadev.concept_alvaflix.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.alvarengadev.concept_alvaflix.R

class HeaderAnimation(
    context: Context,
    attributeSet: AttributeSet
) : ConstraintLayout(
    context,
    attributeSet
) {
    private var view: View? = null

    init {
        view = LayoutInflater.from(context)
            .inflate(
                R.layout.component_header_animation,
                this,
                true
            )
    }
}