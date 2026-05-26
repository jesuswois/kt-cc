// ----------------------------------Exercise 8----------------------------------

// Reverse the digits in a decimal number using a `while` loop. An auxiliary
// `var worker` will help you iteratively produce the `result`:

// | Worker     | Result |
// |------------|--------|
// | 1234       | 0      |
// | 123        | 4      |
// | 12         | 43     |
// | 1          | 432    |
// | 0          | 4321   |

fun main(){
    println(reverseDigits(1234))
}

fun reverseDigits(digits: Int):Int{
    val digitString = digits.toString();
    var worker = "";
    var iteration = 1
    while(true){
        if(iteration>digitString.length) break;
        worker += digitString[digitString.length-iteration++]
    }
    return worker.toInt()
}
