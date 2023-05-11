package com.example.thredsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switch1: SwitchCompat = findViewById(R.id.switch1)
        val textViewCounter : TextView = findViewById (R.id.tvCounter)

        switch1.setOnClickListener{
            val newRunnable = RunnableSample(
                textViewCounter)
            Thread(newRunnable).start()
        }
    }
}

class RunnableSample(
    private val textView: TextView,
    ) : Runnable {
    override fun run() {
        for (i in 0..10) {
            Thread.sleep(1000)

            textView.post{
                textView.text = i.toString()
            }
        }
    }
}
