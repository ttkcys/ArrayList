package com.yusud.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ArrayList
        println("---------------ArrayList---------------")

        val isimListesi = arrayListOf<String>("Yusufhan","Oğuzhan")
        println(isimListesi.get(1))
        println(isimListesi[0])

        isimListesi.add("Gözde")
        println(isimListesi.size)

        //Kotlin
        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add(3)
        karisikArrayList.add("Kotlin")
        karisikArrayList.add(true)

        //Java alışkanlığı
        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))
    }
}