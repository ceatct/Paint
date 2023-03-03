package com.example.paint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paint.PaintView.Companion.colorList
import com.example.paint.PaintView.Companion.currentBrush
import com.example.paint.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBt = findViewById<ImageButton>(R.id.redColor)
        val blackBt = findViewById<ImageButton>(R.id.blackColor)
        val blueBt = findViewById<ImageButton>(R.id.blueColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        redBt.setOnClickListener {
            Toast.makeText(this, "red color", Toast.LENGTH_LONG).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blackBt.setOnClickListener {
            Toast.makeText(this, "black color", Toast.LENGTH_LONG).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        blueBt.setOnClickListener {
            Toast.makeText(this, "blue color", Toast.LENGTH_LONG).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        eraser.setOnClickListener {
            Toast.makeText(this, "cleared", Toast.LENGTH_LONG).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }

    private fun currentColor(color : Int){
        currentBrush = color
        path = Path()
    }

}