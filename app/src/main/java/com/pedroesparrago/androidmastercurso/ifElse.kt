package com.pedroesparrago.androidmastercurso

fun main(){
    ifBasico()
    ifAnidado()
    ifBoolean()
    ifINT()
    ifMultiple()
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var soyFeliz = true


    // "|| = or" "&& = and"
    //Puedo seleccionar donde apliza los and o los or con parentesis
    if(age >= 18 && (parentPermission || soyFeliz)){
        println("Puedo beber cerveza")
    }else{
        println("No puedo beber cerveza")
    }
}

fun ifINT(){
    var age = 18

    if(age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber juguito")
    }
}

fun ifBoolean(){
    var soyFeliz:Boolean = true
    var buttonPressed:Boolean = true

    buttonPressed = !buttonPressed

    if(soyFeliz){
        println("Estoy feliz!!")
    }else{
        println("Estoy triste :c")
    }
}

fun ifAnidado(){
    val animal = "reptile"

    if(animal == "dog"){
        println("Es un perrito")
    }else if (animal == "cat"){
        println("Es un gato")
    }else if (animal == "bird"){
        println("Es un pajaro")
    }else {
        println("No es uno de los animales esperados")
    }
}

fun ifBasico(){
    val name = "Pablo"

    //pasa el valor name a minuscula
    if(name.lowercase() == "pablo"){
        println("La variable name es pablo")
    }
    //Pasa el valor name a mayuscula
    if(name.uppercase() == "PABLO"){
        println("La variable name es PABLO")
    }
}