package com.pedroesparrago.androidmastercurso.sintaxis

//VARIABLES

val edad1:Int = 23  //val no puede cambiar el valor
val pi:Float = 3.1415f

fun main(){
    mostrarMinombre("Pablo Villalobos Donoso")
    mostrarMiEdad(23)
    add(64,11)
    val mySybstract = substract(10,5)
    println(mySybstract)
}

fun mostrarMinombre(nombre:String){
    println("Me llamo $nombre")
}

fun mostrarMiEdad(currentAge:Int = 50){
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int){
    println(firstNumber + secondNumber)
}

fun substract(firstNumber: Int, secondNumber: Int):Int = firstNumber - secondNumber


fun variableAlfanumericas(){
    /*
    Variables Alfanumericas
    */

    //Char solo 1 caracter
    val caracter1:Char = 's'
    val caracter2:Char = '*'
    val caracter3:Char = '3'

    //String
    val cadena1:String = "hola mundo Pedro Esparrago 2024"
    val nombre:String = "Pablo Villalobos"
    val cadena2:String = "2024"
    val cadena3:String = "24"
    var cadenaConcatenada:String = "Hola"
    println(cadenaConcatenada)
    cadenaConcatenada = "Hola me llamo " + nombre
    println(cadenaConcatenada)
    cadenaConcatenada = "Hola me llamo $nombre y tengo $edad1 años"
    println(cadenaConcatenada)




    var ejemploSuma:Int = edad1 + pi.toInt()
    //Sumar dos String las va concatenar, hay que usar el toInt
    //println(cadena2.toInt() + cadena3.toInt())
}

fun variablesBoolean(){
    /*
    Variables Booleanas
    */

    //Boolean
    val booleanEjemplo1:Boolean = true
    val booleanEjemplo2:Boolean = false
}

fun variablesNumericas(){
    /*
    Variable Numericas
    */

    //Int -2,147,483,648 hasta 2,147,483,647

    var edad2:Int = 23  //var si puede cambiar valor

    //Long -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807
    val metros:Long = 654231556

    //Float (siempre poner la f al final del número)
    val pi:Float = 3.1415f

    //Double
    val double:Double = 4655.54456456

    print("Sumar: ")
    println(edad1 + edad2)

    print("Restar: ")
    println(edad1 - edad2)

    print("Multiplicar: ")
    println(edad1 * edad2)

    print("Dividir: ")
    println(edad1 / edad2)

    print("Módulo: ")
    println(edad1 % edad2)
}