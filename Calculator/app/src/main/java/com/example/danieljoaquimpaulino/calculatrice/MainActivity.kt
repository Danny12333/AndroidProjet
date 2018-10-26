package com.example.danieljoaquimpaulino.calculatrice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buNumberEvent(view: View ){

        var tvNumber:String= tvShowNumber.text.toString()

        var buSelect = view as Button

        when (buSelect.id){

            bu0.id->{


                tvNumber += "0"
            }

            bu1.id->{
                tvNumber += "1"


            }
            bu2.id->{
                tvNumber += "2"


            }
            bu3.id->{
                tvNumber += "3"


            }
            bu4.id->{
                tvNumber += "4"


            }
            bu5.id->{
                tvNumber += "5"


            }

            bu6.id->{
                tvNumber += "6"


            }
            bu7.id->{
                tvNumber += "7"


            }
            bu8.id->{
                tvNumber += "8"


            }
            bu9.id->{
                tvNumber += "9"


            }
            buPoint.id->{
                tvNumber += "."


            }
            buPlus.id->{
                tvNumber = "-" + tvNumber


            }



        }

      tvShowNumber.text = tvNumber


    }
}

