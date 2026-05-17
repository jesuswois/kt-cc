

import com.sun.org.apache.xpath.internal.operations.Bool// ----------------------------------Exercise 3----------------------------------

// Using only `if` expressions, write the functions `and()` and `or()`. Each
// function takes two `Boolean` parameters and returns the same results as the
// built-in `&&` and `||` operators.

fun main(){
    println(and(true, false).toString()+" "+or(false, true).toString())
}

fun and(first: Boolean, second: Boolean): Boolean{
    return first && second
}

fun or(first: Boolean, second: Boolean): Boolean{
    return first || second
}