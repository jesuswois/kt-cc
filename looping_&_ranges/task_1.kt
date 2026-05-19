// ----------------------------------Exercise 1----------------------------------

// Using a `for` loop, create a function that calculates the factorial of its
// parameter (`n! = 1 * 2 * ... * n`).

// Put an `L` at the end of a number literal or use `.toLong()` to convert an
// integer constant or expression to type `Long`.

fun main(){
    println(factorial(0))
}

fun factorial(number: Int): Long{
    var sum = 1L
    for(value in 1..number){
        sum *=value
    }
    return sum
}