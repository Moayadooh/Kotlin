fun main()
{
    println(Add(5,6))
    println(Add(5,6,3))
}

fun Add(num1:Int, num2: Int):Int
{
    return num1 + num2
}

fun Add(num1:Int, num2: Int, num3: Int):Int
{
    return num1 + num2 + num3
}