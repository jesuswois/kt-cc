// ----------------------------------Exercise 9----------------------------------

// Display a triangle. For n = 6 the function `showTriangle()` should produce the
// following:

//      #
//     ###
//    #####
//   #######
//  #########
// ###########

main()

fun main(){
    showTriangle(6)
}

fun showTriangle(size: Int): Unit{
    var tags = 1
    for(spaces in size downTo 1){
        printRow(spaces, tags)
        tags +=2
        println("")
    }
}

fun printRow(spaces: Int, tags: Int): Unit{
    for(space in 1..spaces){
        print(" ")
    }
    for(tag in 1..tags){
        print("#")
    }
    for(space in 1..spaces){
        print(" ")
    }
}