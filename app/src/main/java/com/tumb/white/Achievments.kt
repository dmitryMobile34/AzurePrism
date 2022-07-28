package com.tumb.white

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tumb.R
import kotlinx.android.synthetic.main.activity_achievments.*

class Achievments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievments)

        iconTwo.colorFilter = ColorMatrixColorFilter(ColorMatrix().apply { setSaturation(0f)})
        iconThree.colorFilter = ColorMatrixColorFilter(ColorMatrix().apply { setSaturation(0f)})
        iconFour.colorFilter = ColorMatrixColorFilter(ColorMatrix().apply { setSaturation(0f)})
        iconFive.colorFilter = ColorMatrixColorFilter(ColorMatrix().apply { setSaturation(0f)})

        backButton.setOnClickListener {
            super.onBackPressed()
        }


    }
}