//----------------------------------Exercise 4----------------------------------
//
//`flatten()` is the reverse operation for `chunked()` (from the previous
//        exercise). This function is called on a `List` of `List`s and returns a single
//        `List` of all elements from the nested `List`s. Implement `flatten()` without
//using the `flatten()` function from the standard library.

main()

fun main(){
    val flattenList = flatten(listOf(listOf("what","bye"),listOf("him","water"),listOf("red")))
    println(flattenList)
}

fun flatten(chunked: List<List<String>>): List<String> {
    val results = mutableListOf<String>()
    for (chunk in chunked){
        for(piece in chunk){
            results.add(piece)
        }
    }
    return results
}