package com.example.td4_exo4

import java.time.format.DateTimeFormatter
import java.util.*

class Lesson(_module:Module,_date: Date) {
    var module=_module
    var dateL=_date
    fun timeInterval():String{
        val formatter = DateTimeFormatter.ofPattern("MM-dd HH:mm")
        val formatted = dateL.toString()
        return formatted+""
    }
}