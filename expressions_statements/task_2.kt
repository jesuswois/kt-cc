// ----------------------------------Exercise 2----------------------------------

// Write three functions using expression body syntax:

// -   `f()` takes two `Int` parameters and returns the sum.

// -   `g()` takes two `String` parameters and returns them, concatenated.

// -   `h()` calls `println()` to display `"h()"`.

// In `main()`, assign the result of each function to a `val`, and specify the
// type. Then display on the console the types of all the functions `f()`, `g()`
// and `h()`, each one on its own line.

fun main(){
    val result_f = f(5,2)
    val result_g = g("Hello ","world!")
    val result_h = h()

    println(result_f)
    println(result_g)
    println(result_h)
}

fun f(first: Int, second: Int){
    return first + second
}

fun g(first: String, second: String){
    return first + second
}

fun h(){
    return println(`"h()"`)
}