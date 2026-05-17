// ----------------------------------Exercise 2----------------------------------

// Implement a `record()` function that returns a `String` in the form: `index
// [status] message`, where each item is passed into `record()` as a parameter.
// `record()` should add a line break at the end of the `String`.

fun main(){
    print(record(1,"OK","Everything went just fine!"))
    print(record(2,"ERROR","Something went wrong!"))
}

fun record(index: Int, status: String, message: String): String{
    return "$index [$status] $message\n"
}