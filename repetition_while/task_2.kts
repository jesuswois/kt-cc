// ----------------------------------Exercise 2----------------------------------

// Using a `while` loop, write a function that sums the integral numbers from zero
// up to and including a given number (the parameter).

fun main(){
    println(sumUpTo(20))
}

fun sumUpTo(number: Long): Long{
    var i: Long = 0;
    var sum = 0L;
    while(i<=number){
        sum += i;
        i++;
    }
    return sum;
}