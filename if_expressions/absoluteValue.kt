
// ----------------------------------Exercise 2----------------------------------

// Create a function `abs()` that returns the absolute value of its parameter:
// for example, `abs(3)` is `3` and `abs(-5)` is `5`.

fun main(){
    println("Absolute value of 5 is ${abs(5)}")
    println("Absolute value of -5 is ${abs(-5)}")
    println("Absolute value of -100 is ${abs(-100)}")
    println("Absolute value of 0 is ${abs(0)}")
}

fun abs(value: Int) : Int{
    return if(value < 0){
        value * -1
    } else value
}