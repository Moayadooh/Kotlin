fun main()
{
    println(Dev(9.0,3.0))

    println()

    val listOfNum = listOf(1,3,4,9,6)
    /*for (num in listOfNum)
    {
        println(num)
    }*/
    listOfNum.forEach(){num -> println(num)}
}

/*fun Dev(num1:Double, num2:Double):Double
{
    return num1 / num2
}*/
val Dev = {num1:Double, num2:Double -> num1 / num2}