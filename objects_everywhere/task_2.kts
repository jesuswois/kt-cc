//----------------------------------Exercise 2----------------------------------
//
//Building on the previous exercise, ignore upper and lower case when testing for
//palindromes. "Bob" should now be considered a palindrome.
//
//HINT: Use `toLowerCase()` to produce a `String` with all lower-case characters.
//You can also use `toUpperCase()`.
//

main()

fun main(){
    println("Is Bob a Palindrome? ${isPalindrome("Bob")}")
    println("Is Joe a Palindrome? ${isPalindrome("Joe")}")
    println("Is Ana a Palindrome? ${isPalindrome("Ana")}")
}

fun isPalindrome(text: String): Boolean = text.lowercase().reversed() == text.lowercase()