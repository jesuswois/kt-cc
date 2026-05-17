

import kotlin.io.print
// ----------------------------------Exercise 3----------------------------------

// Create a function `findMax()` that finds the maximum value when given two
// integer arguments.

fun main(){
    println("The max number between 5 and 10 is ${findMax(5,10)}")
    println("The max number between -10 and 0 is ${findMax(0,-10)}")
}

fun findMax(number_1: Int, number_2: Int):Int{
    return when{
        number_1<number_2 -> number_2
        else -> number_1
    }
}
