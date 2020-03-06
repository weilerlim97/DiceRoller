package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        /*Count up Button*/
        /* val countUpButton : Button = findViewById(R.id.countup_button)
        countUpButton.setOnClickListener{ countUp() }*/

        /*Text View*/
        /*val resultText : TextView = findViewById(R.id.result_text)
        resultText.text= "Dice Rolled!"*/
    }


    private fun rollDice() {

        /* val resultText : TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()*/
        // val diceImage: ImageView = findViewById(R.id.dice_image)

        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }

    private fun getRandomDiceImage(): Int {

        val randomInt = (1..6).random()
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

/*    private fun countUp(){
        val resultText : TextView = findViewById(R.id.result_text)
        //if text is the default Hello World set the text to 1
        if ( resultText.text =="Hello World!")
        {
            resultText.text= "1"
        }
        else
        {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
        var resultInt = resultText.text.toString().toInt()
            if (resultInt<6)
            {
                resultInt ++
                resultText.text= resultInt.toString()
            }
        }
    }*/


}
