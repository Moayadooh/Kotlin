fun main()
{
    val num = 5
    println(num!=6 && num<7)

    println(num in 6..15) //Range
    if (num in 6..15) //Range
        println("That's right")

    var x = 3
    when(x)
    {
        1 -> {
            println("Yes")
        }
        2 -> {
            println("No")
        }
        else -> {
            println("Nothing")
        }
    }

    val isOk = if(num==6) 1 else 0
    println(isOk)

    var isAcceptable = when(num){
        5 -> true
        else -> false
    }
    println(isAcceptable)

}