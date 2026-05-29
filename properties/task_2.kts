//----------------------------------Exercise 2----------------------------------
//
//A `Robot` object starts in the `(0, 0)` cell and can move right, left, up and
//        down. Its location is stored as a pair of coordinates `(x, y)`, where `(0, 0)`
//is the top-left corner:
//
//(x, y)
//(0, 0) (1, 0)
//(0, 1) (1, 1)
//
//Moving right increases the `x` coordinate, moving down increases the `y`
//coordinate, while moving left and up decrease the `x` and `y` coordinates.
//
//Implement `Robot`'s member functions `right()`, `left()`, `up()` and `down()`,
//each of which takes a `steps` parameter. Also implement `getLocation()` which
//        returns the `Robot`'s coordinates as a `String` in the form `(x, y)`.

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

