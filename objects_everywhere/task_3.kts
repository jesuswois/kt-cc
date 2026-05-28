//----------------------------------Exercise 3----------------------------------
//
//Building on the previous exercise, strip out special characters before testing.
//"Madam I'm Adam" should now be considered a palindrome.
//
//HINT: Build a new `String` consisting of letters only, and check whether it's
//a palindrome. Use `in` to check whether a character is a letter:
//`ch in 'a'..'z' || ch in 'A'..'Z'`.
//

main()

fun main(){
    println("Is Bob a Palindrome? ${isPalindrome("Bob")}")
    println("Is Joe a Palindrome? ${isPalindrome("Joe")}")
    println("Is Ana a Palindrome? ${isPalindrome("Ana")}")
    println("Is 'Madam I'm Adam' a Palindrome? ${isPalindrome(lettersOnly("Madam I'm Adam"))}")
}z

fun lettersOnly(text: String): String{
    var finalText = ""
    for(char in text){
        if(char in 'a'..'z' || char in 'A'..'Z'){
            finalText += char.toString()
        }
    }
    return finalText
}

fun isPalindrome(text: String): Boolean = text.lowercase().reversed() == text.lowercase()