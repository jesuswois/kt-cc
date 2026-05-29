//----------------------------------Exercise 1----------------------------------
//
//Create a class named `SomeClass` with three member functions: `a()` which
//displays `42` on the console when you call it, `b()` which calls `a()`,
//and `c()` which calls `b()` by qualifying it.
//

main()

fun main(){
    val classInstance = SomeClass()
    classInstance.a()
    classInstance.b()
    classInstance.c()
}

class SomeClass{
    fun a() = println("42")
    fun b() = a()
    fun c() = b()
}