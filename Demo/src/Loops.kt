fun main()
{
    //Increment
    for (i in 1..5 step 1)
    {
        println("Number: $i")
    }
    println()

    //Decrement
    for (i in 10 downTo 0 step 3)
    {
        println("Number: $i")
    }
    println()

    //While loop
    var j = 0;
    while (j<=5)
    {
        print("$j, ")
        j += 1
    }
    println()

    j = 0;
    do {
        print("$j, ")
        j += 1
    }while (j<3)
}
