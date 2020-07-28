import java.util.*

fun main()
{
    print("Enter year of birth: ")
    val year: Int = readLine()!!.toInt()
    val age = Calendar.getInstance().get(Calendar.YEAR) - year
    print("you are $age years old")
}