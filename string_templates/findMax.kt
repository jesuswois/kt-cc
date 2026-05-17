// ----------------------------------Exercise 1----------------------------------

// Display the result of the function `findMax()` (from the exercises in the
// previous atom) on the console in the form "The maximum of x and y is max." Use
// a `String` template to perform the substitution of  `x`, `y` and the maximum
// value.

fun main(){
    val x, y = 5, 10;
    val z, w = 0, -10;
    println("The maximum of $x and $y is ${findMax(x,y)}")
    println("The maximum of $z and $w is ${findMax(z,w)}")
}

fun findMax(number_1, number_2){
    return if(number_1>number_2) number_1 else number_2
}