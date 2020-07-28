package com.moayad.oop

//Basic class example
class Car(var type:String, val model:Int, val price:Double, val milesDrive:Int, val owner:String){
    //Method fired automatically when creating new instance
    /*init {
        println("Object is created")
    }*/

    //getPrice  -> Not allowed
    //this keyword -> Not necessary
    fun getCarPrice():Double
    {
        return this.price - this.milesDrive.toDouble()*10
    }

    //No need "You can set the value directly"
    /*fun setCarType(type: String)
    {
        this.type = type
    }*/
}

fun main()
{
    /*val car1 = Car("Suzuki",2017, 4800.0, 50, "Salim AL-Falahi")
    car1.type = "Swift"
    println(car1.type)
    println(car1.getCarPrice())

    val car2 = Car("Corolla",2012, 6000.0, 100, "Salim AL-Falahi")
    println(car2.type)*/

    val listOfCars = arrayListOf<Car>()
    listOfCars.add(Car("Suzuki", 2017, 4800.0, 50, "Salim AL-Falahi"))
    listOfCars.add(Car("Corolla", 2012, 6000.0, 100, "Salim AL-Falahi"))

    for (car in listOfCars)
    {
        println("______________")
        println(car.type)
        println(car.getCarPrice())
        println(car.owner)
    }
}