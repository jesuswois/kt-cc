//----------------------------------Exercise 3----------------------------------
//
//Write a function `listOfChunks()` that takes a `vararg` parameter of type
//`String` and creates a `List` of `List`s of characters. The first parameter
//        for `listOfChunks()` is the chunk size, and all nested `List`s except the last
//        one will have this size.
//
//HINT: Use the standard library function `chunked()` on `List`.
//

main()

fun main(){
    val list1 = mutableListOf<String>("one", "two", "three", "four")
    println(list1)
    println(list1.chunked(1))
    println(listOfChunks(3,"what","hi","bye","yellow","leopard","zed","50","cloud","rather","brother"))
}

fun listOfChunks(size: Int, vararg strings: String): List<List<String>>{
    return strings.toList().chunked(size)
}