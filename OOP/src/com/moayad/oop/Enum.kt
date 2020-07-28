package com.moayad.oop

enum class Directions{
    NORTH, SOUTH, EAST, WEST
}

fun main()
{
    val direc = Directions.NORTH
    if (direc==Directions.SOUTH)
        println("He went on the SOUTH")
    else
        println("I don't know where he went!!")
}