//----------------------------------Exercise 3----------------------------------
//
//Create a `Robot` class with the following four member functions:
//`right(steps: Int)`, `left(steps: Int)`, `down(steps: Int)` and
//        `up(steps: Int)`. Each function should display one of the following
//        phrases on the console:
//
//Right N steps
//Left N steps
//Down N steps
//Up N steps
//
//where N is the provided number of steps.

main()

class Robot{
    fun right(steps: Int) = println("Right $steps steps")
    fun left(steps: Int) = println("Left $steps steps")
    fun down(steps: Int) = println("Down $steps steps")
    fun up(steps: Int) = println("Up $steps steps")
}

fun main(){
    val robot1 = Robot()
    robot1.up(5)
}