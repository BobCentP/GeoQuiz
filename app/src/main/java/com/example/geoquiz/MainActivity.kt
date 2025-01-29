package com.example.geoquiz
import android.app.ProgressDialog.show
import android.widget.Button
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


private lateinit var trueButton: Button
private lateinit var falseButton: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
            val toast=Toast.makeText(
                this,
                R.string.correct_toast,
                Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,0,0)
            toast.show()

        }
        falseButton.setOnClickListener { view: View ->
            val toast=Toast.makeText(
                this,
                R.string.incorrect_toast,
                Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,0,0)
                toast.show()

        }
    }
}