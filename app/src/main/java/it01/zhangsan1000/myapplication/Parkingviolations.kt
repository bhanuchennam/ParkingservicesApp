package it01.zhangsan1000.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


class Parkingviolations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.parking_violations)

        val textView = findViewById(R.id.date) as TextView
        val calendar: Calendar = Calendar.getInstance()
        val simpleDateFormat = SimpleDateFormat("EEEE, dd-MMM-yyyy hh-mm-ss a")
        val dateTime = simpleDateFormat.format(calendar.getTime())
        textView.setText(dateTime)
    }
}