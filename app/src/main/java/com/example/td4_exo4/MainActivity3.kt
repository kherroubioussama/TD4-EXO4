package com.example.td4_exo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val actionBar: ActionBar?=supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        var intent=intent
        val enseignant=intent.getSerializableExtra("Ens") as Enseignant
        val fname=enseignant.fname
        val lname=enseignant.lname
        actionBar.title="Enseignant"
        ensName.text=fname
        ensSecondName.text=lname
    }
}