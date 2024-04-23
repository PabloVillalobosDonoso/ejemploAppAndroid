package com.pedroesparrago.androidmastercurso.todoapp

data class Task (val name:String, val category: TaskCategory, var isSelected:Boolean = false)