//----------------------------------Exercise 1----------------------------------
//
//Palindromes are words or phrases that read the same forward and backward. For
//example:
//
//-   "mom" is a palindrome
//
//-   "dad" is a palindrome
//
//-   "rotator" is a palindrome
//
//-   "streets" is *not* a palindrome
//
//Write a function that checks whether a word or phrase is a palindrome.
//
//HINT: `String`'s `reversed()` member function may prove useful here. Use `==`
//to check whether two `String`s are equivalent.

main()

fun main(){
    println("Is bob a Palindrome? ${isPalindrome("bob")}")
    println("Is joe a Palindrome? ${isPalindrome("joe")}")
    println("Is ana a Palindrome? ${isPalindrome("ana")}")
}

fun isPalindrome(text: String): Boolean = text.reversed() == text