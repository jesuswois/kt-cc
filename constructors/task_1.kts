//----------------------------------Exercise 1----------------------------------
//
//Create a class `Floating` that contains a `val d` of type `Double`. Initialize
//        `d` in the constructor. Include a `toString()` member function that returns the
//contents of `d`. Write a `main()` to exercise the `Floating` class.
//

main()

class main(){
    val floatNumber = Floating(1.0)
    println(floatNumber)
}

class Floating(val d: Double){
    override fun toString() = "$d"
}

