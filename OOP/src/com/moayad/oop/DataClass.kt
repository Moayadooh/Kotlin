package com.moayad.oop

data class Person(val name:String, val age:Int, val gender:String)

fun main()
{
    val person1 = Person("Moayad", 23, "Male")
    val person2 = Person("Eyad", 1, "Male")

    println(person1.name)
    println(person1.age)
    println(person1.gender)
    println(person2.name)
    println(person2.age)
    print(person2.gender)

}