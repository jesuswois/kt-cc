// ----------------------------------Exercise 2----------------------------------

// Use `step` to write a function that sums only even numbers up to a given
// number (the parameter).

fun main(){
    println(sumEvenNumbersUpTo(6))
}

fun sumEvenNumbersUpTo(maxNumber: Int): Long{
    var sum = 0L
    for(evenNumber in 0..maxNumber step 2){
        sum += evenNumber
    }
    return sum
}