package com.munawirfikri.layout_asj

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val number = intent.getStringExtra("value")
        val textFeed : TextView = findViewById(R.id.textFeed)

        textFeed.text = "$number"

    }
}