import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main()
{
    println("Array List")
    val AL = ArrayList<Int>() //Waste  the space
    AL.add(1997)
    AL.add(1999)
    AL.add(2001)
    println(AL[1])
    for (element in AL)
    {
        println(element)
    }

    println()

    println("Linked List")
    val LL = LinkedList<Double>() //Slower to search
    LL.add(3.75)
    LL.add(3.9)
    println(LL[1])
    for (element in LL)
    {
        println(element)
    }

    println()

    println("Hash Map")
    var HM = HashMap<Int,String>()
    HM[1] = "Eyad"
    HM[5] = "Moayad"
    HM[9] = "Salim"
    println(HM[1])
    for (key in HM.keys)
    {
        println("$key: ${HM[key]}")
    }

    println()

    var myHashMap = HashMap<String,LinkedList<String>>()

    print("Enter your name: ")
    var name = readLine()!!.toString()

    var myLinkedList = LinkedList<String>()
    print("Enter your age: ")
    myLinkedList.add(readLine()!!.toString())
    print("Enter your GPA: ")
    myLinkedList.add(readLine()!!.toString())

    myHashMap[name] = myLinkedList

    for (key in myHashMap.keys)
    {
        println(key)
        for (values in myHashMap[key]!!)
        {
            println(values)
        }
    }

}
