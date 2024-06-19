
//package com.example.basiccalculator
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}
package com.example.basiccalculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1 = findViewById<TextView>(R.id.tvOperand1)
        val operator = findViewById<TextView>(R.id.tvOperator)
        findViewById<Button>(R.id.button1)?.setOnClickListener() {
            val add = "1"
            val update = text1.text.toString()
            text1.text = update + add
        }
        findViewById<Button>(R.id.button2)?.setOnClickListener() {
            val add = "2"
            val update = text1.text.toString()
            text1.text = update + add
        }
        findViewById<Button>(R.id.button3)?.setOnClickListener() {
            val add = "3"
            val update = text1.text.toString()
            text1.text = update + add
        }
        findViewById<Button>(R.id.button4)?.setOnClickListener() {
            val add = "4"
            val update = text1.text.toString()
            text1.text = update + add
        }
        findViewById<Button>(R.id.button5)?.setOnClickListener() {
            val add = "5"
            val update = text1.text.toString()
            text1.text = update + add
        }
        findViewById<Button>(R.id.button6)?.setOnClickListener() {
            val add = "6"
            val update = text1.text.toString()
            text1.text = update + add
        }
        findViewById<Button>(R.id.button7)?.setOnClickListener() {
            val add = "7"
            val update = text1.text.toString()
            text1.text = update + add
        }
        findViewById<Button>(R.id.button8)?.setOnClickListener() {
            val add = "8"
            val update = text1.text.toString()
            text1.text = update + add
        }
        findViewById<Button>(R.id.button9)?.setOnClickListener() {
            val add = "9"
            val update = text1.text.toString()
            text1.text = update + add
        }
        findViewById<Button>(R.id.button0)?.setOnClickListener() {
            val add = "0"
            val update = text1.text.toString()
            text1.text = update + add
        }
//        findViewById<Button>(R.id.button31)?.setOnClickListener() {
//            val new=text1.text.toString().dropLast(1)
//            text1.text=new
//        }
        findViewById<Button>(R.id.buttond)?.setOnClickListener() {
            val add = "."
            val update = text1.text.toString()
            text1.text = update + add
        }
        findViewById<Button>(R.id.buttonA)?.setOnClickListener() {
            operator.text = "+"
            val text = text1.text.toString()
            result('+', text)
        }
        findViewById<Button>(R.id.buttonS)?.setOnClickListener() {
            operator.text = "-"
            val text = text1.text.toString()
            result('-', text)
        }
        findViewById<Button>(R.id.buttonM)?.setOnClickListener() {
            operator.text = "*"
            val text = text1.text.toString()
            result('*', text)
        }
        findViewById<Button>(R.id.buttonD)?.setOnClickListener() {
            operator.text = "/"
            val text = text1.text.toString()
            result('/', text)
        }

    }

    @SuppressLint("SetTextI18n")
    private fun result(operator: Char, text1: String){
        val text11 = findViewById<TextView>(R.id.tvOperand1)
        val text2 = findViewById<TextView>(R.id.tvOperand2)
        val resultBox = findViewById<TextView>(R.id.tvResult)
        val resetBtn = findViewById<Button>(R.id.btnReset)
        val operator1 = findViewById<TextView>(R.id.tvOperator)
//        findViewById<Button>(R.id.delete)?.setOnClickListener() {
//            val new=text2.text.toString().dropLast(1)
//            text2.text=new
//        }
        findViewById<Button>(R.id.button1)?.setOnClickListener() {
            val add = "1"
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.button2)?.setOnClickListener() {
            val add = "2"
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.button3)?.setOnClickListener() {
            val add = "3"
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.button4)?.setOnClickListener() {
            val add = "4"
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.button5)?.setOnClickListener() {
            val add = "5"
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.button6)?.setOnClickListener() {
            val add = "6"
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.button7)?.setOnClickListener() {
            val add = "7"
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.button8)?.setOnClickListener() {
            val add = "8"
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.button9)?.setOnClickListener() {
            val add = "9"
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.button0)?.setOnClickListener() {
            val add = "0"
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.buttond)?.setOnClickListener() {
            val add = "."
            val update = text2.text.toString()
            text2.text = update + add
        }
        findViewById<Button>(R.id.buttonE)?.setOnClickListener() {
            if (text1 == "") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                lateinit var answer: String
                val op = text2.text.toString()
                if (operator == '+') {
                    val num = (text1.toFloat() + op.toFloat())
                    answer = num.toString()
                }
                if (operator == '-') {
                    val num = (text1.toFloat() - op.toFloat())
                    answer = num.toString()
                }
                if (operator == '*') {
                    val num = (text1.toFloat() * op.toFloat())
                    answer = num.toString()
                }
                if (operator == '/') {
                    val num = (text1.toFloat() / op.toFloat())
                    answer = num.toString()
                }
                resultBox.text = answer
            }
        }
        resetBtn.setOnClickListener() {
            text11.text = ""
            text2.text = ""
            resultBox.text = ""
            operator1.text = ""
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            }
        }
}


