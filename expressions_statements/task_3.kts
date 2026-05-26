// ----------------------------------Exercise 3----------------------------------

// Guess what the following code will display and then check yourself using
// Kotlin:

// var i = 1
// println(i-- - --i)

// Open the hint in IntelliJ IDEA to see the explanation.

// HINT: This code can be rewritten as:

// // i-- means:
// // First the current value is produced,
// // then the value is decremented.
// val left = i // i: 1, left: 1
// i -= 1 // i: 0

// // --i means:
// // First the value is decremented,
// // then the current value is produced.
// i -= 1 // i: -1
// val right = i // i: -1, right: -1

// val result =
//   left - right // 1 - (-1) = 1 + 1 = 2
// println(result)

fun main(){
    var i = 1;
    println(i-- - --i); // 1 - -1 = 2

    i = 1;
    println(i++ + ++i); //  1 + 3 = 4
}