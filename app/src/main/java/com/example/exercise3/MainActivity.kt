package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener(){

            val age =spinner.selectedItemPosition

            val gender = radioGroup.checkedRadioButtonId

            val result:Double

            if(spinner.selectedItemPosition ==0){
                  result = 60.00
            }

            else if(spinner.selectedItemPosition ==1){
                  result = 70.00 +(if(radMale.isChecked) 50.00 else 0.0) + (if(checkBox.isChecked) 100.00 else 0.0)

            }

            else if(spinner.selectedItemPosition ==2){
                result = 90.00 +(if(radMale.isChecked) 100.00 else 0.0) + (if(checkBox.isChecked) 150.00 else 0.0)

            }

            else if(spinner.selectedItemPosition ==3){
                result = 120.00 +(if(radMale.isChecked) 150.00 else 0.0) + (if(checkBox.isChecked) 200.00 else 0.0)

            }

            else if(spinner.selectedItemPosition ==4){
                result = 150.00 +(if(radMale.isChecked) 200.00 else 0.0) + (if(checkBox.isChecked) 250.00 else 0.0)

            }
            else{
                result = 150.00 +(if(radMale.isChecked) 200.00 else 0.0) + (if(checkBox.isChecked) 300.00 else 0.0)


            }

            textView5.text=result.toString()
        }


        button2.setOnClickListener() {
            checkBox .isChecked =false
                    radioGroup.clearCheck()
            textView5.text = " "

        }
    }
}
