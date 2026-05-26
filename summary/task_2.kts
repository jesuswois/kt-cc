// ----------------------------------Exercise 2----------------------------------

// Create a function `other()` that takes a `String` parameter and returns a
// `String` containing every other letter of the parameter. For example, the
// argument "cement" produces "cmn".

fun main(){
    println(other("cement"))
}

fun other(text: String): String{
    var newString = ""
    var iteration = 1
    for (character in text) {
        if(iteration++%2!=0){
            newString += character.toString()
        }
    }
    return newString
}