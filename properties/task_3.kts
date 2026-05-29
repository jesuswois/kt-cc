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
    robotInstance.right(5)
    robotInstance.up(5)
    println(robotInstance.getLocation())
    robotInstance.left(6)
    robotInstance.down(5)
    println(robotInstance.getLocation())
}

class Robot{
    var x = 0;
    var y = 0;
    fun getLocation(): String{
        return "($x, $y)";
    }
    fun crossBoundaries(x_value: Int = 0, y_value: Int = 0){
        if(x_value>100 || x_value<0){
            // Excede el valor

        }

        if(y_value>100){
            y = y_value%100
        }
    }
    fun up(steps: Int){
        // Moving down increases the 'y' value.
        y += steps;
    }
    fun down(steps: Int){
        // Moving down decreases the 'y' value.
        y -= steps;
    }
    fun right(steps: Int){
        // Moving to the right increases the 'x' value.
        x += steps;
    }
    fun left(steps: Int){
        // Moving to the left increases the 'x' value.
        x -= steps;
    }
}