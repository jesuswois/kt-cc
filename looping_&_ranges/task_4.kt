// ----------------------------------Exercise 4----------------------------------

// Display half of a triangle. For an argument of 6 the function
// `showHalfTriangle()` should display the following:

// #
// ##
// ###
// ####
// #####
// ######

// Now rewrite the function to use `repeat` instead of a `for` loop.

fun main(){
    showHalfTriangle(6)
}

fun showHalfTriangle(size: Int){
    for(row in 1..size){
        for(hashtagNumber in 1..row){
            print("#")
        }
        println()
    }
}