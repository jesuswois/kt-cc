// ----------------------------------Exercise 6----------------------------------

// Implement `everyFifthNonWhitespace()` to display every fifth non-whitespace
// character in the given text. For example, `everyFifthNonWhitespace("abc d e fgh
//  ik")` displays the characters `e` (fifth character if not counting
// whitespaces) and `k` (tenth).

fun main(){
    everyFifthNonWhitespace("abc d e fgh ik")
}

fun everyFifthNonWhitespace(text: String): Unit{
    var counter = 1
    for(character in text){
        if(character in 'a'..'z' || character in 'A'..'Z'){
            if(counter%5 == 0){
                println(character)
            }
            counter++;
        }
    }
}