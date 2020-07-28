package com.moayad.oop

//Constructor class example
open class Student(){
    var id:Int? = null
    var name:String? = null
    var age:Int? = 0
    constructor(id:Int, name:String, age:Int):this()
    {
        this.id = id
        this.name = name
        this.age = age
    }
    constructor(id:Int, name:String):this()
    {
        this.id = id
        this.name = name
    }

    open fun getAge():Int
    {
        return this.age!!
    }
}

fun main()
{
    val student1 = Student(15128, "Moayad", 23)
    println(student1.name)

    val student2 = Student(151281, "Eyad")
    print(student2.name)
}