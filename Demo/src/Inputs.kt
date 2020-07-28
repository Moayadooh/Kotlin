fun main()
{
    //!! means must not be null
    var name:String = readLine()!!
    var age = readLine()!!.toInt()
    var gpa: Double = readLine()!!.toDouble()

    println("Name is $name")
    println("Age is $age")
    println("GPA is $gpa")
}