//----------------------------------Exercise 3----------------------------------
//
//A `Robot` can move within a square field of size `100 x 100`. The borders of
//this field are "looped": if the robot is in cell `(0, 0)` and moves up one
//        step, it arrives in cell `(0, 99)`.
//
//(0, 0)
//// up(1)
//(0, 99)
//// left(10)
//(90, 99)
//
//Modify `right()`, `left()`, `up()` and `down()` to implement this behavior.
//
//HINT: Write an auxiliary ("helper") member function named `crossBoundary()` to
//        check the boundaries. This eliminates repetition and simplifies the resulting
//code.as


main()

fun main(){
    val robotInstance = Robot()
    robotInstance.down(1)
    println(robotInstance.getLocation())
    robotInstance.left(10)
    println(robotInstance.getLocation())
}

class Robot{
    var x = 0;
    var y = 0;
    fun getLocation(): String{
        return "($x, $y)";
    }
    fun crossBoundaries(x_value: Int = 0, y_value: Int = 0){
        if(x+x_value<0){
            x = (x+x_value)%(100*(x+x_value/100))*-1
        } else{
            x = (x+x_value)%100
        }
        if(y+y_value<0) {
            // Occurrences saves the division of the value of the sum of y and y_value, between 100. Basically telling us
            // how many times does 100 appear.
            val occurrences = 1
            y = (y+y_value)%(100*(y+y_value/100))*-1
        } else {
            y = (y+y_value)% 100
        }
    }
    fun up(steps: Int){
        // Moving down increases the 'y' value.
        crossBoundaries(0,steps);
    }
    fun down(steps: Int){
        // Moving down decreases the 'y' value.
        crossBoundaries(0, -steps)
    }
    fun right(steps: Int){
        // Moving to the right increases the 'x' value.
        crossBoundaries(steps,0)
    }
    fun left(steps: Int){
        // Moving to the left increases the 'x' value.
        crossBoundaries(-x,steps)
    }
}