//----------------------------------Exercise 2----------------------------------
//
//Create a class `Giraffe` with a single member function `displayID()` that
//        displays the address of the object. Call `String`s `substringAfter()` to
//extract the address from the default object representation. Run the following
//code and compare the addresses:
//
//val giraffe1 = Giraffe()
//val giraffe2 = Giraffe()
//val giraffe3 = Giraffe()
//giraffe1.displayID()
//giraffe2.displayID()
//giraffe3.displayID()
//

class Giraffe{
    fun displayID() = println(this.toString().substringAfter("@"))
}

val giraffe1 = Giraffe()
val giraffe2 = Giraffe()
val giraffe3 = Giraffe()
giraffe1.displayID()
giraffe2.displayID()
giraffe3.displayID()