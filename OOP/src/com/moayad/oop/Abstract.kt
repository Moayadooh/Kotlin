package com.moayad.oop

abstract class CreditCard1 {
    fun getCardID():String
    {
        return "5v1d1d51583792"
    }
    abstract fun NewCard()
}

class CardInfo(): CreditCard1() {
    override fun NewCard()
    {
        println("New Card Created")
    }

}

fun main()
{
    //Directly creating instance from abstract class is NOT ALLOWED
    /*val obj = CreditCard1()
    print(obj.getCardID())*/

    val obj = CardInfo()
    println(obj.getCardID())
    obj.NewCard()
}