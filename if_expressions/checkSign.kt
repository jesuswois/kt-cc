// ----------------------------------Exercise 1----------------------------------

// Create a function `checkSign()` that checks whether an integer number is
// positive, negative, or zero, and returns a `String` "positive", "negative" or
// "zero" as a result.

fun main() {
    println(checkSign(5))
    println(checkSign(-5))
    println(checkSign(1))
    println(checkSign(0))
}

fun checkSign(value: Int):String{
    return if(value > 0) {
        "positive"
    } else if(value == 0){
        "zero"
    } else {
        "negative"
    }
}