fun main()
{
    var immutableList = listOf("Moayad","Mohanned") //Immutable List
    //immutableList[0] = "Eyad"        --> Not allowed
    //immutableList.add("Mohammed")    --> Not allowed
    for (value in immutableList)
    {
        println(value)
    }

    println()

    var mutableList = mutableListOf("Moayad","Mohanned") //mutable List
    mutableList[0] = "Eyad"
    mutableList.add("Mohammed")
    for (value in mutableList)
    {
        println(value)
    }

    println()

    val immutableMap = mapOf(1 to "Muna", 2 to "Salim")
    //immutableMap[0] = "Miqat" --> Not allowed
    println(immutableMap)

    val mutableMap = mutableMapOf(1 to "Muna", 2 to "Salim")
    mutableMap[0] = "Miqat"
    println(mutableMap)
}