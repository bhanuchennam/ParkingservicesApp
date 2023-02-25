package it01.zhangsan1000.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById(R.id.btn_submit) as Button

        val new_user = findViewById(R.id.new_txt) as TextView
// set on-click listener
        btn_click_me.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
            Toast.makeText(this@MainActivity, "Hurray.... you are logged in", Toast.LENGTH_SHORT).show()
        }

        new_user.setOnClickListener {
            val i2 = Intent(this , New_user::class.java)
            startActivity(i2)
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }


    }
}