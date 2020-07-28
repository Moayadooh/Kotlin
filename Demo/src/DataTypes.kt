fun main()
{
    //val is non updatable
    //var is updatable

    //val varName: String = "Anything"
    var name = "Moayad"
    val age = 23
    val gpa = 3.9
    println("Name is $name")
    println("Age is $age")
    println("GPA is $gpa")

    //Data type it most be given to assign value in the second line
    var mobile: String? //by default the value is null
    mobile = null
    println({mobile!!})

    //Divide double value by 0 will give 'Infinity'
    var num: Double = 5.0/0
    print("$num")
}