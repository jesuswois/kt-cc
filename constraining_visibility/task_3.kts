//----------------------------------Exercise 3----------------------------------
//
//A `Robot` can only move forward. Check that the `steps` argument is a positive
//number. For `right()`, `left()`, `down()` and `up()`, a negative or zero
//        `steps` argument should not update the location. Instead it should produce
//        console output using this `String`:
//
//"steps argument must be positive, is $steps"
//
//In `main()`, test your code using positive, negative and zero values of
//`steps`.


main()

fun main(){
    val robotInstance = Robot()
    robotInstance.up(1)
    println(robotInstance.getLocation())
    robotInstance.left(10)
    println(robotInstance.getLocation())
    println(robotInstance)
}

class Robot(x: Int,y: Int, field_size: Int){
    private var x = 0;
    private var y = 0;
    private val field_size = 100
    override fun toString(): String = "Robot(x=$x, y=$y)"
    fun getLocation(): String{
        return "($x, $y)";
    }
    private fun crossBoundaries(x_value: Int = 0, y_value: Int = 0){
        if(x+x_value<0){
            x = (x+x_value)+(field_size*(x+1+(x_value/field_size)))
        } else{
            x = (x+x_value)%field_size
        }
        if(y+y_value<0) {
            y = (y+y_value)+(field_size*(y+1+(y_value/field_size)))
        } else {
            y = (y+y_value)% field_size
        }
    }
    fun up(steps: Int){
        // Moving down increases the 'y' value.
        crossBoundaries(0,-steps);
    }
    fun down(steps: Int){
        // Moving down decreases the 'y' value.
        crossBoundaries(0, steps)
    }
    fun right(steps: Int){
        // Moving to the right increases the 'x' value.
        crossBoundaries(steps,0)
    }
    fun left(steps: Int){
        // Moving to the left increases the 'x' value.
        crossBoundaries(-steps,0)
    }
}