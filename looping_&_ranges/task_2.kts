// ----------------------------------Exercise 2----------------------------------

// Using a `for` loop, create a function that sums the factorials up to its
// parameter (`1! + 2! + ... + n!`).

fun main(){
    println(sumFactorials(4))
}

fun sumFactorials(number: Int): Long{
    var sum = 0L;
    for(value in 1..number){
        var factorial = 1L
        for(num in 1..value){
            factorial *= num
        }
        sum += factorial
    }
    return sum
}