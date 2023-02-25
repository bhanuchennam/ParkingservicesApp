package it01.zhangsan1000.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtview1 = findViewById(R.id.idTVHeading) as TextView
        val txtview2 = findViewById(R.id.idTVMsg) as TextView
        val txtview4 = findViewById(R.id.bhuvi) as TextView

        val txtview3 = findViewById(R.id.tickets) as TextView


        val txtview6 = findViewById(R.id.bookings) as TextView

        txtview1.setOnClickListener {
              val i = Intent(this , Grawnhall::class.java)
              startActivity(i)
        }

        txtview2.setOnClickListener {
            val i2 = Intent(this,RonanHall::class.java)
            startActivity(i2);
        }
        txtview4.setOnClickListener {
            val i5 = Intent(this , Bovee::class.java)
            startActivity(i5)
        }

        txtview3.setOnClickListener {
            val i6= Intent(this, Bookings::class.java)
            startActivity(i6)
        }

        txtview6.setOnClickListener {
            val i7 = Intent(this , BookingHistory::class.java)
            startActivity(i7)
        }

    }
}