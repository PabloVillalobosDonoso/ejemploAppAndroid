package com.pedroesparrago.androidmastercurso.sintaxis

fun main(){

    //el "?" dice que la variable puede ser nula
    var name:String? = "Pablo"

    //los dos "!" dicen que estoy seguro que la variable no es nula
    println(name!![2])

    //con el "?" no se me caerla app
    println(name?.get(3) ?: "LA variable es nula")

}