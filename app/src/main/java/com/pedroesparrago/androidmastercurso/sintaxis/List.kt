package com.pedroesparrago.androidmastercurso.sintaxis

fun main(){
    //inmutableList()
    mutableList()
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(4,"InfunableDay") //Añade valor a la ultima posicion o a la posicion especificada antes del valor
    println(weekDays)

    if (weekDays.isEmpty()){
        //no muestro nada porque no hay
    }else{
        weekDays.forEach { println(it) }
    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    weekDays.last()

}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //Filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)
    println(readOnly.filter { it.contains("a") })

    //Iterar
    readOnly.forEach { weekDay -> println(weekDay) }
}