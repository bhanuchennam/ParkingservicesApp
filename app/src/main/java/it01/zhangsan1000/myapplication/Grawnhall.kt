package it01.zhangsan1000.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class Grawnhall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val img: ImageView = findViewById<View>(R.id.myRectangleView) as ImageView

        val btn_click_me = findViewById(R.id.button) as Button

        var boolean=false

        img.setOnClickListener {
            img.setImageResource(R.drawable.ic_baseline_directions_car_24)
            boolean=true
        }

        btn_click_me.setOnClickListener {
            val snack = Snackbar.make(it,"Slot booked",Snackbar.LENGTH_LONG)
            snack.show()

        }




    }
}