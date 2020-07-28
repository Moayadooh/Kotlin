fun main()
{
    val name = "Moayad"
    if (name.contains("Moa")) //Check if this letter or combinations of letters are exists in the variable
        println(name.toUpperCase())

    println(name[3])

    val sentence = "Water Control System for AL-Nakheel Tree Using Fuzzy Logic"
    val tokens = sentence.split(" ")
    for (token in tokens)
    {
        print("$token ")
    }
}
