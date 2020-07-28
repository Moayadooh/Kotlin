package com.moayad.oop

//Use same data in multiple instances of the class
class Singleton {
    var name:String? = null
    private constructor(){
        println("Object is created")
    }
    companion object {
        val instance:Singleton by lazy{Singleton()}
    }
}

fun main()
{
    val obj = Singleton.instance
    obj.name = "Moayad"
    println(obj.name)

    val obj1 = Singleton.instance
    println(obj1.name)

    val obj2 = Singleton.instance
    println(obj2.name)
}