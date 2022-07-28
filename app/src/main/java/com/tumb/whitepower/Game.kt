package com.tumb.whitepower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tumb.R
import kotlinx.android.synthetic.main.activity_game.*

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val buttons = arrayOf(
            oneOne, oneTwo, oneThree, twoOne, twoTwo, twoThree, threeOne, threeTwo
        )

        val images = mutableListOf(
            R.drawable.passion, R.drawable.passion,
            R.drawable.pineapple, R.drawable.pineapple,
            R.drawable.apricot, R.drawable.apricot,
            R.drawable.pomegranate, R.drawable.pomegranate
        )

        val cardBack = R.drawable.salad
        var clicked = 0
        var turnOver = false
        var lastClicked = -1

        images.shuffle()

        for(i in 0..7) {
            buttons[i].setBackgroundResource(cardBack)
            buttons[i].tag = "cardBack"
            buttons[i].setOnClickListener {
                if (buttons[i].tag == "cardBack" && !turnOver) {
                    buttons[i].setBackgroundResource(images[i])
                    buttons[i].tag = images[i]
                    if (clicked == 0) {
                        lastClicked = i
                    }
                    clicked++
                } else if (buttons[i].tag != "cardBack") {
                    buttons[i].setBackgroundResource(cardBack)
                    buttons[i].tag = "cardBack"
                    clicked--
                }

                if (clicked == 2) {
                    turnOver = true
                    if (buttons[i].tag == buttons[lastClicked].tag) {
                        buttons[i].isClickable = false
                        buttons[lastClicked].isClickable = false
                        turnOver = false
                        clicked = 0
                    }
                } else if (clicked == 0) {
                    turnOver = false
                }
            }
        }

        restartButton.setOnClickListener {
            recreate()
        }

    }

}