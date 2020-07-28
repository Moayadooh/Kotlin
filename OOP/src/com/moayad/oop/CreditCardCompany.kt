package com.moayad.oop

//Object oriented design
//interface example (same implementation must available in different design)
interface CreditCard{
    val cardNumber:String
    fun Score(age:Int)
}

class MasterCard(override val cardNumber: String) : CreditCard {
    override fun Score(age: Int) {
        if (age > 50)
            println("Negative")
        else
            println("Positive")
    }

}

class Visa(override val cardNumber: String) : CreditCard {
    override fun Score(age: Int) {
        if (age > 60)
            println("Negative")
        else
            println("Positive")
    }

}

class PayPal(client: CreditCard): CreditCard by client{
    fun Print()
    {
        println(this.cardNumber)
    }
}

fun main()
{
    val visa = Visa("849549549444")
    visa.Score(40)

    val payPal1 = PayPal(visa)
    println("Card number: ${payPal1.cardNumber}")

    val masterCard = MasterCard("63535342444535")
    masterCard.Score(40)

    val payPal2 = PayPal(masterCard)
    println("Card number: ${payPal2.cardNumber}")
    payPal2.Print()
}