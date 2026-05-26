// ----------------------------------Exercise 4----------------------------------

// This exercise modifies `Overflow.kt` to test `Long` and `Double`. Implement
// `testLong()` to display the `Long` maximum value incremented by `1`. Make
// `testDouble()` display the `Double` maximum value incremented by `1`. Make
// `testDouble2()` display the result of comparing `Double.MAX_VALUE` and
// `Double.MAX_VALUE + 1`.

fun main(){
    testLong()
    testDouble()
    testDouble2()
}

fun testLong(){
    println(Long.MAX_VALUE)
}

fun testDouble(){
    println(Double.MAX_VALUE)
}

fun testDouble2(){
    println(Double.MAX_VALUE==Double.MAX_VALUE + 1)
}