// ----------------------------------Exercise 3----------------------------------

// Using a `for` loop, create a function that sums up only even numbers up to its
// parameter.

fun main(){
    println(sumEvenNumbersUpTo(6))
}

fun sumEvenNumbersUpTo(value: Int): Long{
    var sum = 0L;
    for(number in 1..value){
        if(number%2 == 0) sum += number
    }
    return sum;
}