package com.pedroesparrago.androidmastercurso.sintaxis

fun main(){
     var name:String = "Pablo"

    val weekDays= arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    weekDays[0] = "Hola"
    println(weekDays[0])

    //Bucles

        //Para cuando me interese la posicion
    for (position in weekDays.indices){
      println(weekDays[position])
    }
        //Para cuando me interese la poriscion y el valor
    for ((position,value ) in  weekDays.withIndex()){
        println("La posicion $position, contiene $value")
    }
        //Para cuando me interese el valor
    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}