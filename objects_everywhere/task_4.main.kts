//----------------------------------Exercise 4----------------------------------
//
//Reverse the digits in an integer number using `String` conversion.

main()

fun main(){
    println("The number 12345 reversed is: ${reverseDigits(12345)}")
}

fun reverseDigits(value: Int): Int = value.toString().reversed().toInt()