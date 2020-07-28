package com.moayad.oop

//Inheritance class example
class ComputingStudent: Student {
    var specialization:String? = null
    constructor(id:Int, name:String, age:Int, specialization:String):super(id, name, age)
    {
        this.specialization = specialization
    }
    constructor(id:Int, name:String, specialization:String):super(id, name)
    {
        this.specialization = specialization
    }

    //Overriding example
    override fun getAge():Int
    {
        return this.age!!+1
    }
}

//Extension (adding function from outside the class)
fun ComputingStudent.getStudentID():Int
{
    return this.id!!
}

fun main()
{
    val computingStudent1 = ComputingStudent(15128, "Moayad", 23, "Software Engineering")
    println(computingStudent1.getStudentID())
    println(computingStudent1.name)
    println(computingStudent1.specialization)

    val computingStudent2 = ComputingStudent(151281, "Eyad", "Networking")
    println(computingStudent2.name)
    println(computingStudent2.specialization)
}