package com.moayad.oop

class Outer{
    private val data:String = "Hello"
    //use 'inner' keyword to access the data in the outer class
    inner class Nested{
        fun Display()
        {
            println(data)
        }
    }
}

fun main()
{
    val obj = Outer()
    val obj1 = obj.Nested()
    obj1.Display()
}