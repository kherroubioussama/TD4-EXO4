package com.example.td4_exo4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_lesson_fragement.*
import java.util.*


class Lesson_fragement : Fragment() {
    var data = mutableListOf<Lesson>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lesson_fragement, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val lesson1:Lesson= Lesson(Module("BDA","2h", Enseignant("Amrouche","Karima")),Date(2021,2,22))
        val lesson2:Lesson= Lesson(Module("ANAD","2h", Enseignant("Imloul","Karima")),Date(2021,2,23))
        data.add(lesson1)
        data.add(lesson2)
        val layoutManager = LinearLayoutManager(activity)
        val adapter = LessonAdapter(activity as MainActivity, data)
        lessonList.layoutManager = layoutManager
        lessonList.adapter = adapter
    }
}