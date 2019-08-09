package com.example.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate.setOnClickListener{
//            var dob = yob.text.toString()
//            var arr = dob.split("/")
//            var date  = arr[0].toInt()
//            var month = arr[1].toInt()
//            var year = arr[2].toInt()
//            val lastDayOfEachMonth = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31)
//            var current_date = Calendar.getInstance().get(Calendar.DATE)
//            var current_month = Calendar.getInstance().get(Calendar.MONTH)
//            var current_year = Calendar.getInstance().get(Calendar.YEAR)
//            if (date > current_date)
//            {
//                current_month-= 1
//                current_date += lastDayOfEachMonth[month-1]
//            }
//            if (month > current_month)
//            {
//                current_year = current_year -1
//                current_month += 12
//            }
//            var date_out = current_date - date
//            var month_out = current_month - month
//            var year_out = current_year - year
//            days.text = "$year_out years $month_out months $date_out days"
            
        }
    }
//

}
