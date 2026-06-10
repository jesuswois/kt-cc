//----------------------------------Exercise 3----------------------------------
//
//Add a `toString()` function that returns the `String` `Robot(x=..., y=...)` where
//        the actual values of `x` and `y` are substituted for the ellipses. For example,
//if `x` is 1 and `y` is 2 it should return `Robot(x=1, y=2)`.

main()

fun main(){
    val robotInstance = Robot()
    robotInstance.up(1)
    println(robotInstance.getLocation())
    robotInstance.left(10)
    println(robotInstance.getLocation())
    println(robotInstance)
}

class Robot(x: Int = 0,y: Int = 0,val field_size: Int = 100){
    var x = 0;
    var y = 0;
    override fun toString(): String = "Robot(x=$x, y=$y)"
    fun getLocation(): String{
        return "($x, $y)";
    }
    fun crossBoundaries(x_value: Int = 0, y_value: Int = 0){
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