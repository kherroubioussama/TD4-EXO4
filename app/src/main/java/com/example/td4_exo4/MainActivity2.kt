package com.example.td4_exo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val actionBar:ActionBar?=supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        var intent=intent
        val module=intent.getSerializableExtra("module") as Module
        val title=module.intutile
        actionBar.title = title
        moduleTitle.text=title
        moduleHour.text=module.duree
        moduleEns.text=module.ens.fname
        cardEns.setOnClickListener {
            Intent(this,MainActivity3::class.java).also {
                it.putExtra("Ens",module.ens)
                startActivity(it)
            }
        }
    }
}