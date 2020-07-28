package com.moayad.oop

open class Operations(){
    open fun Multi(num1:Int, num2: Int):Int
    {
        return num1 * num2
    }
}

class MultiOperation: Operations {
    constructor():super(){

    }
    override fun Multi(num1: Int, num2: Int): Int {
        return num1 * num2 * 3
    }
}

fun main()
{
    val MO = MultiOperation() as Operations //Casting
    val tot = MO.Multi(5, 5)
    print(tot)
}