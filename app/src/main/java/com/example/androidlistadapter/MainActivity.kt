    package com.example.androidlistadapter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

    class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    lateinit var adapter: programingAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recycilerView)


        adapter= programingAdapter()

        val p1=programingItem(1,"sowrov","java")

        val p2=programingItem(2,"j","kotlin")

        val p3=programingItem(1,"p","android")

       val p4=programingItem(1,"sowrov","java")

        val p5=programingItem(2,"j","kotlin")

        val p6=programingItem(1,"p","android")

        val p7=programingItem(1,"sowrov","java")

        val p8=programingItem(2,"j","kotlin")

        val p9=programingItem(1,"p","android")

       val p10=programingItem(1,"sowrov","java")

        val p11=programingItem(2,"j","kotlin")

        val p12=programingItem(1,"p","android")


        adapter.submitList(listOf(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12))



     recyclerView.layoutManager=LinearLayoutManager(this)


        recyclerView.setHasFixedSize(true)

        recyclerView.adapter=adapter













    }
}