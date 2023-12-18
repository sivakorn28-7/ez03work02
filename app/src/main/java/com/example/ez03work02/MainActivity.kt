package com.example.ez03work02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sub1: TextView = findViewById(R.id.sub1)
        val sub2: TextView = findViewById(R.id.sub2)
        val sub3: TextView = findViewById(R.id.sub3)
        val sub4: TextView = findViewById(R.id.sub4)
        val sub5: TextView = findViewById(R.id.sub5)

        val cr1: TextView = findViewById(R.id.cr1)
        val cr2: TextView = findViewById(R.id.cr2)
        val cr3: TextView = findViewById(R.id.cr3)
        val cr4: TextView = findViewById(R.id.cr4)
        val cr5: TextView = findViewById(R.id.cr5)
        val crcal: TextView = findViewById(R.id.crcal)

        val po1: TextView = findViewById(R.id.po1)
        val po2: TextView = findViewById(R.id.po2)
        val po3: TextView = findViewById(R.id.po3)
        val po4: TextView = findViewById(R.id.po4)
        val po5: TextView = findViewById(R.id.po5)
        val gpacal: TextView = findViewById(R.id.gpacal)

        val okbt: Button = findViewById(R.id.okbt)
        val clearbt: Button = findViewById(R.id.clearbt)

        fun gpacalculate(grades: List<String>): Double {
            val gradePoints = mapOf(
                "A" to 4.0,
                "B+" to 3.5,
                "B" to 3.0,
                "C+" to 2.5,
                "C" to 2.0,
                "D+" to 1.5,
                "D" to 1.0,
                "F" to 0.0
            )
            val totalGradePoints = grades.sumByDouble { gradePoints[it] ?: 0.0 }
            val gpa = totalGradePoints / grades.size
            return gpa
        }

        okbt.setOnClickListener{
            var sub1 = sub1.text.toString()
            var sub2 = sub2.text.toString()
            var sub3 = sub3.text.toString()
            var sub4 = sub4.text.toString()
            var sub5 = sub5.text.toString()

            var cr1 = cr1.text.toString()
            var cr2 = cr2.text.toString()
            var cr3 = cr3.text.toString()
            var cr4 = cr4.text.toString()
            var cr5 = cr5.text.toString()

            var po1 = po1.text.toString()
            var po2 = po2.text.toString()
            var po3 = po3.text.toString()
            var po4 = po4.text.toString()
            var po5 = po5.text.toString()


            if(sub1 == "" || sub2 == "" || sub3 ==""|| sub4 ==""|| sub5 ==""){
                Toast. makeText(applicationContext,"กรุณากรอกให้ครบ", Toast. LENGTH_SHORT).show()
            }else{ }

            if(cr1 == "" || cr2 == "" || cr3 ==""|| cr4 ==""|| cr5 ==""){
                Toast. makeText(applicationContext,"กรุณากรอกให้ครบ", Toast. LENGTH_SHORT).show()
            }else{
                if(cr1.toInt() < 1 || cr2.toInt() < 1 || cr3.toInt() < 1 || cr4.toInt() < 1|| cr5.toInt() < 1){
                    Toast. makeText(applicationContext,"กรุณากรอกให้อยู่ระหว่าง 1 ถึง 3", Toast. LENGTH_SHORT).show()
                }else if(cr1.toInt() > 3 || cr2.toInt() > 3 || cr3.toInt() > 3 || cr4.toInt() > 3|| cr5.toInt() > 3){
                    Toast. makeText(applicationContext,"กรุณากรอกให้อยู่ระหว่าง 1 ถึง 3", Toast. LENGTH_SHORT).show()
                }else{
                    var ccal = cr1.toInt() + cr2.toInt() + cr3.toInt() + cr4.toInt() + cr5.toInt()
                    crcal.setText(ccal.toString())
                }
            }

            if(po1 == "" || po2 == "" || po3 ==""|| po4 ==""|| po5 ==""){
                Toast. makeText(applicationContext,"กรุณากรอกให้ครบ", Toast. LENGTH_SHORT).show()
            }else{
                if(po1 == "A" || po1 == "B+" || po1 == "B" || po1 == "C+" ||  po1 == "C" ||  po1 == "D+" ||  po1 == "D" ||  po1 == "F" ){
                    if(po2 == "A" || po2 == "B+" || po2 == "B" || po2 == "C+" ||  po2 == "C" ||  po2 == "D+" ||  po2 == "D" ||  po2 == "F" ){
                        if(po3 == "A" || po3 == "B+" || po3 == "B" || po3 == "C+" ||  po3 == "C" ||  po3 == "D+" ||  po3 == "D" ||  po3 == "F" ){
                            if(po4 == "A" || po4 == "B+" || po4 == "B" || po4 == "C+" ||  po4 == "C" ||  po4 == "D+" ||  po4 == "D" ||  po4 == "F" ){
                                if(po5 == "A" || po5 == "B+" || po5 == "B" || po5 == "C+" ||  po5 == "C" ||  po5 == "D+" ||  po5 == "D" ||  po5 == "F" ){
                                    val subjectGrades =  mutableListOf<String>()

                                    subjectGrades.add(po1)
                                    subjectGrades.add(po2)
                                    subjectGrades.add(po3)
                                    subjectGrades.add(po4)
                                    subjectGrades.add(po5)

                                    val gcal = gpacalculate(subjectGrades)
                                    gpacal.setText(gcal.toString())

                                }else{
                                    Toast. makeText(applicationContext,"กรุณากรอกเกรดให้ถูกต้อง", Toast. LENGTH_SHORT).show()
                                }
                            }else{
                                Toast. makeText(applicationContext,"กรุณากรอกเกรดให้ถูกต้อง", Toast. LENGTH_SHORT).show()
                            }
                        }else{
                            Toast. makeText(applicationContext,"กรุณากรอกเกรดให้ถูกต้อง", Toast. LENGTH_SHORT).show()
                        }
                    }else{
                        Toast. makeText(applicationContext,"กรุณากรอกเกรดให้ถูกต้อง", Toast. LENGTH_SHORT).show()
                    }
                }else{
                    Toast. makeText(applicationContext,"กรุณากรอกเกรดให้ถูกต้อง", Toast. LENGTH_SHORT).show()
                }
            }

        }
        clearbt.setOnClickListener {
            sub1.setText("")
            sub2.setText("")
            sub3.setText("")
            sub4.setText("")
            sub5.setText("")

            cr1.setText("")
            cr2.setText("")
            cr3.setText("")
            cr4.setText("")
            cr5.setText("")

            po1.setText("")
            po2.setText("")
            po3.setText("")
            po4.setText("")
            po5.setText("")
        }
    }
}