package com.example.foodorderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ch1 = findViewById<View>(R.id.pizza) as CheckBox
        var ch2 = findViewById<View>(R.id.burgur) as CheckBox
        var rate1 = findViewById<View>(R.id.Pprice) as TextView
        var rate2 = findViewById<View>(R.id.bprice) as TextView
        var quantity1 = findViewById<View>(R.id.pizzatext) as EditText
        var quantity2 = findViewById<View>(R.id.burgurtext) as EditText
        var bill = findViewById<View>(R.id.bill) as TextView
        var makebill = findViewById<View>(R.id.button) as Button
        makebill.setOnClickListener(View.OnClickListener {
            var total = 0;
            bill.text="BILL\nMenu\tbutton\n"
            if(ch1.isChecked){
                total = total + rate1.text.toString().toInt()*quantity1.text.toString().toInt()
                bill.text=bill.text.toString()+ch1.text.toString() + "\t"+ ( rate1.text.toString().toInt()*quantity1.text.toString().toInt() ).toString()+"\t"
            }
            if(ch2.isChecked){
                total = total + rate2.text.toString().toInt()*quantity2.text.toString().toInt()
                bill.text=bill.text.toString()+ch2.text.toString()+"\t" + ( rate2.text.toString().toInt()*quantity2.text.toString().toInt() ).toString()+"\t"
            }

            bill.text = bill.text.toString()+"Total Bill = \t\t\t\t\t" + total.toString()

        })


    }
}
