// ----------------------------------Exercise 4----------------------------------

// Write a function that checks whether its `String` parameter is a valid
// identifier. A valid identifier is a non-empty `String` that starts with a letter
// or underscore and consists of only letters, digits and underscores.

// Use `s.isEmpty()` to check whether `s` is an empty `String`.

fun main(){
    println("_nombre_variable_ is valid?: "+isValidIdentifier("_nombre_variable_"))
    println("_nombr3_vari3_ble_ is valid?: "+isValidIdentifier("_nombr3_vari3_ble_"))
    println("_!_variable is a valid identifier?: "+isValidIdentifier("_!_variable"))
}

fun isValidIdentifier(name: String): Boolean {
    if(name.isEmpty() && (isLetter(name[0]) || name[0]=='_')) return false
    var valid: Boolean = true
    for(character in name){
        if(isDigit(character) || isLetter(character) || character == '_'){
            valid = true
            continue
        }
        valid = false
        break;
    }
    return valid
}

fun isDigit(character: Char): Boolean = character in '0'..'9'

fun isLetter(character: Char): Boolean = character in 'a'..'z' || character in 'A'..'Z'