// ----------------------------------Exercise 1----------------------------------

// Guess the results of the following expressions and then check yourself using
// Kotlin:

// val a = 11 / 3
// val b = 11 % 3
// val c = a * 3 + b
// val d = 6 / 5.0

// Note that the `val`s `a`, `b` and `c` have type `Int`, while the `val`
// `d` has type `Double`.

fun main(){
    val a = 11 / 3 // 3
    val b = 11 % 3 // 2
    val c = a * 3 + b // 11
    val d = 6 / 5.0 // 1.2

    print("a = $a\nb = $b\nc = $c\nd = $d")
}