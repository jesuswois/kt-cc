// ----------------------------------Exercise 3----------------------------------

// Write a function that checks whether a character is a lowercase letter.

// HINT: Test to see whether its code is between the codes for `a` and `z`.

fun main(){
    println(isLowercase('A'))
}

fun isLowercase(character: Char): Boolean = character in 'a'..'z'