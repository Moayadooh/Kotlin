fun main()
{
    var size = 3
    var array: Array<String> = Array(size){""}
    array[0] = "Moayad"
    array[1] = "Mohanned"
    array[2] = "Mohammed"

    for (i in 0 until size)
    {
        println(array[i])
    }

    /*for (element in array)
    {
        println(element)
    }*/
}