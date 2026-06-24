//----------------------------------Exercise 3----------------------------------
//
//Write a function to determine whether two `String`s are anagrams. An anagram
//is a word formed by rearranging the letters of a different word, using all the
//original letters exactly once.
//
//HINT: Compare two sorted `Lists` of characters obtained from two `String`s.
//Convert a `String` to a `List` by calling `toList()`. If the `Lists` are equal,
//the words are anagrams. For example, for two anagrams "terrain" and "trainer"
//the sorted character `List` will be `[a, e, i, n, r, r, t]`.

main()

fun main(){
    println(anagramCheck("Ana","Naa"))
}

fun anagramCheck(firstString: String, secondString: String): Boolean{
    val firstStringList = firstString.lowercase().toList()
    val secondStringList = secondString.lowercase().toList()

    println("First string: ${firstStringList.sorted()}")
    println("Second string: ${secondStringList.sorted()}")
    if(firstStringList.sorted() == secondStringList.sorted()) return true

    return false
}