package com.vibetube.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = "VibeTube App\nVersão 3.8\n\nApp instalado com sucesso!"
        setContentView(textView)
    }
}
