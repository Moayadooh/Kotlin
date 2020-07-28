fun main()
{
    val items = arrayListOf<Int>(5,9,7,3,2)
    println("Array list items: ")
    for (item in items)
    {
        println(item)
    }
    println("Maximum is: ${items.findMax()}")
}

fun ArrayList<Int>.findMax():Int
{
    var maxItem = 0
    for (item in this)
    {
        if (item > maxItem)
            maxItem = item
    }
    return maxItem
}