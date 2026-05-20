// ----------------------------------Exercise 3----------------------------------

// Write a function `first()` that has an *expression body* starting with `if`.
// The function takes three `Boolean` parameters and "ands" them together to
// produce the result. Write `second()` to do the same but "or" all three
// parameters. In `main()`, display the result of combining `first()` and
// `second()` using both "and" and "or":

// | `first()` Arguments | `second()` Arguments |
// |---------------------|----------------------|
// | true, true, true    | false, false, false  |
// | true, false, true   | false, true, false   |

fun main(){
    println("first()")
    println(first(true,true,true))
    println(first(true,false,true))
    println("second()")
    println(second(false,false,false))
    println(second(false,true,false))
}

fun first(bool_1: Boolean, bool_2: Boolean, bool_3: Boolean): Boolean = bool_1 && bool_2 && bool_3

fun second(bool_1: Boolean, bool_2: Boolean, bool_3: Boolean): Boolean = bool_1 || bool_2 || bool_3