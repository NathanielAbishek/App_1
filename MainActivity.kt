package com.example.app1

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.app1.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    //private lateinit var layout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var newSize = false
        binding.buttonFontSize.setOnClickListener {
            if (!newSize) {
                binding.textView.textSize = 40f
                newSize = true
            }
            else {
                binding.textView.textSize = 30f
                newSize = false
            }
        }

        var newTextColor = false
        binding.buttonFontColor.setOnClickListener {
            if (!newTextColor) {
                binding.textView.setTextColor(Color.RED)
                newTextColor = true
            }
            else {
                binding.textView.setTextColor(Color.BLACK)
                newTextColor = false
            }
        }

        var newBGColor = false
        binding.buttonBackgroundColor.setOnClickListener {
            if (!newBGColor) {
                binding.layout.setBackgroundColor(Color.YELLOW)
                newBGColor = true
            }
            else {
                binding.layout.setBackgroundColor(Color.WHITE)
                newBGColor = false
            }
        }

        var newFont = false
        binding.buttonFont.setOnClickListener {
            if (!newFont) {
                val typeface = Typeface.create("cursive", Typeface.NORMAL)
                binding.textView.typeface = typeface
                newFont = true
            }
            else {
                val typeface = Typeface.create("sans-serif", Typeface.NORMAL)
                binding.textView.typeface = typeface
                newFont = false
            }
        }

    }
}
