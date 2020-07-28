fun main()
{
    Hello()
    println(Add(6))
    println(Add(6, 6))
    println(Add(y=6))
    List(values = *arrayOf("Eyad", "Manasik"))
}

// void function
fun Hello()
{
    println("Hello")
}

// int function
fun Add(x:Int = 9, y:Int = 1):Int
{
    return (x+y)
}

fun List(vararg values:String)
{
    for (number in values)
    {
        println(number)
    }
}
