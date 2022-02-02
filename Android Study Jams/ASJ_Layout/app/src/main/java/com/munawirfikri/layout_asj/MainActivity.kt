package com.munawirfikri.layout_asj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var feed1: ImageView
    private lateinit var feed2: ImageView
    private lateinit var feed3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        feed1 = findViewById(R.id.feed1)
        feed2 = findViewById(R.id.feed2)
        feed3 = findViewById(R.id.feed3)

        feed1.setOnClickListener(this)
        feed2.setOnClickListener(this)
        feed3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.feed1 -> {
                val value = "Feed 1"
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("value", value)
                startActivity(intent)
            }
            R.id.feed2 -> {
                val value = "Feed 2"
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("value", value)
                startActivity(intent)
            }
            R.id.feed3 -> {
                val value = "Feed 3"
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("value", value)
                startActivity(intent)
            }
        }
    }
}
