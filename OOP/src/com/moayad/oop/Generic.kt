package com.moayad.oop

class Admin<T>(credit:T){
    init {
        println(credit)
    }
}

fun <T>Display(data:T)
{
    println(data)
}

fun main()
{
    val obj = Admin<String>("Moayad")
    val obj2 = Admin<Int>(123)

    Display<Int>(5)
    Display<String>("Eyad")
}