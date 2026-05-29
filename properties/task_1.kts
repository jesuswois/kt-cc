//----------------------------------Exercise 1----------------------------------
//
//Create a class `X` that contains three `Int` properties: `a` and `b` are `val`s
//and `c` is a `var`. Initialize `a` to 3, `b` to 42, and `c` to zero. Create an
//`add()` member function that sums `a` and `b` and assigns the result to `c`,
//then returns `c`. Write a `main()` to test `X`.
//

main()

fun main(){
    val classInstance = X()
    println(classInstance.add())
    println(classInstance.add())
}

class X {
    val a = 3
    val b = 42
    var c = 0
    fun add(): Int{
        c = a + b
        return c
    }
}