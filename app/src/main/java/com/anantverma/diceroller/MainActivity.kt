package com.anantverma.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollerBtn = findViewById<Button>(R.id.btnRoll)
        rollerBtn.setOnClickListener {
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_LONG).show()
            val dice = Dice(6)

            val outcomeTxt = findViewById<TextView>(R.id.txtOutcome)
            outcomeTxt.text = dice.roll().toString()

            val outcomeTxt2 = findViewById<TextView>(R.id.txtOutcome2)
            outcomeTxt2.text = dice.roll().toString()
        }
    }
}

class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}