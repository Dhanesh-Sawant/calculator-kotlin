package com.example.calculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.PrimitiveIterator
import kotlin.math.cos
import kotlin.math.min
import kotlin.math.sqrt


class MainActivity : AppCompatActivity() {

    lateinit var primaryTV : TextView
    lateinit var secondaryTV : TextView


    lateinit var ACBtn : TextView
    lateinit var CBtn : TextView
    lateinit var brac1Btn : TextView
    lateinit var brac2Btn : TextView
    lateinit var sinBtn : TextView
    lateinit var cosBtn : TextView
    lateinit var tanBtn : TextView
    lateinit var logBtn : TextView
    lateinit var LnBtn : TextView
    lateinit var factBtn : TextView
    lateinit var squareBtn : TextView
    lateinit var rootACBtn : TextView
    lateinit var inverseACBtn : TextView
    lateinit var divideACBtn : TextView
    lateinit var Btn0 : TextView
    lateinit var Btn1 : TextView
    lateinit var Btn2 : TextView
    lateinit var Btn3 : TextView
    lateinit var Btn4 : TextView
    lateinit var Btn5 : TextView
    lateinit var Btn6 : TextView
    lateinit var Btn7 : TextView
    lateinit var Btn8 : TextView
    lateinit var Btn9 : TextView
    lateinit var mulBtn : TextView
    lateinit var minusBtn : TextView
    lateinit var addBtn : TextView
    lateinit var pieBtn : TextView
    lateinit var dotBtn : TextView
    lateinit var equalBtn : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        primaryTV = findViewById(R.id.idTVPrimary)
        secondaryTV = findViewById(R.id.idTVSecondary)

        ACBtn = findViewById(R.id.idBtnAC)
        CBtn = findViewById(R.id.idBtnC)
        brac1Btn = findViewById(R.id.idBtnBrac1)
        brac2Btn = findViewById(R.id.idBtnBrac2)
        sinBtn = findViewById(R.id.idBtnSin)
        cosBtn = findViewById(R.id.idBtnCos)

        tanBtn = findViewById(R.id.idBtnTan)
        logBtn = findViewById(R.id.idBtnLog)
        LnBtn = findViewById(R.id.idBtnln)
        factBtn = findViewById(R.id.idBtnFact)
        squareBtn = findViewById(R.id.idBtnSqr)
        rootACBtn = findViewById(R.id.idBtnSqrt)

        inverseACBtn = findViewById(R.id.idBtnInverse)
        divideACBtn = findViewById(R.id.idBtnDiv)
        Btn0 = findViewById(R.id.idBtn0)
        Btn1 = findViewById(R.id.idBtn1)
        Btn2 = findViewById(R.id.id2)
        Btn3 = findViewById(R.id.id3)

        Btn4 = findViewById(R.id.idBtn4)
        Btn5 = findViewById(R.id.idBtn5)
        Btn6 = findViewById(R.id.idBtn6)
        Btn7 = findViewById(R.id.idBtnSeven)
        Btn8 = findViewById(R.id.idBtnEight)
        Btn9 = findViewById(R.id.idBtnNine)

        mulBtn = findViewById(R.id.idBtnMul)
        minusBtn = findViewById(R.id.idBtnMinus)
        addBtn = findViewById(R.id.idBtnPlus)
        pieBtn = findViewById(R.id.idBtnpie)
        dotBtn = findViewById(R.id.idBtnDot)
        equalBtn = findViewById(R.id.idBtnEqual)

        Btn0.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "0")
        }
        Btn1.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "1")
        }
        Btn2.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "2")
        }
        Btn3.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "3")
        }
        Btn4.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "4")
        }
        Btn5.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "5")
        }
        Btn6.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "6")
        }
        Btn7.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "7")
        }
        Btn8.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "8")
        }
        Btn9.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "9")
        }

        dotBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + ".")
        }

        addBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "+")
        }

        divideACBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "/")
        }

        brac1Btn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "(")
        }

        brac2Btn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + ")")
        }

        pieBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "3.142")
            secondaryTV.text = pieBtn.text.toString()
        }

        sinBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "sin")
        }

        cosBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "cos")
        }
        tanBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "tan")
        }

        inverseACBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "^ (-1)")
        }

        LnBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "ln")
        }

        logBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString() + "log")
        }

        minusBtn.setOnClickListener{
            val str : String = primaryTV.text.toString()
            if(!str.get(index = str.length-1).equals("-")){
                primaryTV.text = primaryTV.text.toString() + "-"
            }
        }

        mulBtn.setOnClickListener{
            val str : String = primaryTV.text.toString()
            if(!str.get(index = str.length-1).equals("*")){
                primaryTV.text = primaryTV.text.toString() + "*"
            }
        }

        rootACBtn.setOnClickListener{
            if(primaryTV.text.isEmpty()){
                Toast.makeText(this,"please enter a valid number",Toast.LENGTH_SHORT).show()
            }
            else{
                val str : String = primaryTV.text.toString()
                val r = Math.sqrt(str.toDouble())
                val result = r.toString()
                primaryTV.text = result

            }
        }

        ACBtn.setOnClickListener{
            primaryTV.text = ""
            secondaryTV.text = ""
        }

        CBtn.setOnClickListener{
            var str : String = primaryTV.text.toString()
            if(!str.equals("")){
                str = str.substring(0,str.length-1)
                primaryTV.text = str
            }
        }

        squareBtn.setOnClickListener{
            if(primaryTV.text.isEmpty()){
                Toast.makeText(this,"Enter a valid number",Toast.LENGTH_SHORT).show()
            }
            else{
                val d: Double = primaryTV.text.toString().toDouble()
                val square = d*d
                primaryTV.text = square.toString()
                secondaryTV.text = square.toString()
            }
        }

        factBtn.setOnClickListener{
            if(primaryTV.text.isEmpty()){
                Toast.makeText(this,"Enter a valid number",Toast.LENGTH_SHORT).show()
            }
            else{
                val value: Int = primaryTV.text.toString().toInt()
                val fact : Int = factorial(value)

                primaryTV.text = fact.toString()
                secondaryTV.text = fact.toString()
            }
        }

        equalBtn.setOnClickListener{
            val str: String = primaryTV.text.toString()
            val result : Double = evaluate(str)
            val r = result.toString()

            primaryTV.text = r
            secondaryTV.text = str
        }

    }

    fun factorial (n : Int) :Int{
        return if(n==1 || n==0) 1 else n * factorial(n-1)
    }

    fun evaluate(str:String): Double{
        return object : Any(){
            var pos = -1
            var ch = 0

            fun nextChar(){
                ch = if(++pos < str.length) str[pos].toInt() else -1
            }

            fun eat(charToEat : Int): Boolean {
                while(ch==' '.toInt()) nextChar()

                if(ch==charToEat){
                    nextChar()
                    return true
                }
                return false
            }
            fun parse() : Double{
                nextChar()
                val x = parseExp()
                if(pos < str.length) throw RuntimeException("Unexpected : " + ch.toChar())
                return x
            }

            fun parseExp() : Double{
                var x = parseTerm()
                while(true){
                    if(eat('+'.toInt()))x +=parseTerm()
                    else if (eat('-'.toInt()))x -= parseTerm()
                    else return x
                }
            }

            fun parseTerm() : Double {
                var x = parseFactor()
                while(true){
                    if(eat('*'.toInt()))x *=parseTerm()
                    else if (eat('/'.toInt()))x /= parseTerm()
                    else return x
                }
            }

            fun parseFactor() : Double {
                if (eat('+'.toInt())) return parseFactor()
                if (eat('+'.toInt())) return -parseFactor()

                var x: Double
                val startpos = pos

                if (eat('('.toInt())) {
                    x = parseExp()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()

                    x = str.substring(startpos, pos).toDouble()

                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {

                    while(ch>='a'.toInt() && ch<='z'.toInt()) nextChar()

                    val func = str.substring(startpos, pos)
                    x = parseFactor()
                    if (func == "sqrt") x=Math.sqrt(x)
                    else if (func == "sin") x=Math.sin(Math.toRadians(x))
                    else if (func == "cos") x=Math.cos(Math.toRadians(x))
                    else if (func == "tan") x=Math.tan(Math.toRadians(x))
                    else if (func == "log") x=Math.log10(x)
                    else if(func == "ln") x=Math.log(x)

                }else{
                    throw RuntimeException(
                        "Unexpected : " + ch.toChar()
                    )
            }
                if(eat('^'.toInt())) x = Math.pow(x,parseFactor())
                return x
            }
        }.parse()
    }


}