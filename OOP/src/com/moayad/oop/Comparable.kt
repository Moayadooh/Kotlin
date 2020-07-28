package com.moayad.oop

import java.util.*
import kotlin.collections.ArrayList

class Person1(var name:String, var age:Int):Comparable<Person1>{
    //if you return positive 'first element grater than second element' //Ascending order
    //if you return negative 'first element less than second element' //Descending order
    //if you return 0 'both elements equal'
    override fun compareTo(other:Person1):Int {
        return this.age - other.age  //Ascending order
        //return other.age - this.age //Descending order
        //return 0
    }
}

fun main()
{
    val listOfNames = ArrayList<Person1>()
    listOfNames.add(Person1("Moayad",23))
    listOfNames.add(Person1("Eyad",1))
    listOfNames.add(Person1("Salim",45))

    println("Before sort:")
    for (person in listOfNames)
    {
        println("Name: "+person.name)
        println("Age: "+person.age)
    }

    println()

    //Collections.sort(listOfNames)
    listOfNames.sort()
    println("After sort:")
    for (person in listOfNames)
    {
        println("Name: "+person.name)
        println("Age: "+person.age)
    }
}