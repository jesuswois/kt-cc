// ----------------------------------Exercise 3----------------------------------

// Using a `while` loop, write a function that sums only even numbers up to and
// including a given number (the parameter).

fun main(){
    println(sumEvenNumbersUpTo(20))
}

fun sumEvenNumbersUpTo(value: Long): Long{
    var sum = 0L;
    var i = 0;
    while(i<=value){
        if(i % 2 == 0) sum += i;
        i++
    }
    return sum;
}