package com.pedroesparrago.androidmastercurso.sintaxis

fun main(){
    println(getSemester(5))
}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if (value) println("holiwi")
    }
}

fun getSemester(month: Int) =  when(month){
        in 1..6 -> "Primer Semestre"
        in 7..12 -> "Segundo Trimestre"
        !in 1..12 -> "Semestre no valido"
        else -> "sdas"
    }


fun getTrimester(month: Int){
    when(month){
        1,2,3 -> println("Primer Trimestre")
        4,5,6 -> println("Segundo Trimestre")
        7,8,9 -> println("Tercer Trimestre")
        10,11,12 -> println("Cuarto Trimestre")
        else -> println("Trimestre no valido")
    }
}

fun getMonth(month:Int){
    when(month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> {
            println("noviembre")
            println("noviembre")
            println("noviembre")
        }
        12 -> println("diciembre")
        else -> println("mes no valido")
    }
}