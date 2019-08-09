package com.example.average_age_count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate.setOnClickListener{
            var gg_father = gg_father.text.toString().toInt()
            var g_father = g_father.text.toString().toInt()
            var g_mother = g_mother.text.toString().toInt()
            var sum_in_days:Int = ((gg_father + g_father + g_mother) / 3) * 365
            var arr = dob.text.toString().split("/")
            var date  = arr[0].toInt()
            var month = arr[1].toInt()
            var year = arr[2].toInt()
            val lastDayOfEachMonth = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31)
            var current_date = Calendar.getInstance().get(Calendar.DATE)
            var current_month = Calendar.getInstance().get(Calendar.MONTH)
            var current_year = Calendar.getInstance().get(Calendar.YEAR)
            if (date > current_date)
            {
                current_month-= 1
                current_date += lastDayOfEachMonth[month-1]
            }
            if (month > current_month)
            {
                current_year = current_year -1
                current_month += 12
            }
            var total_days = (current_year - year) * 365 + (current_month - month) * 12 + (current_date - date)
            var days_left = sum_in_days - total_days
            display.text = "$days_left days left"
        }
    }
}
