//----------------------------------Exercise 1----------------------------------
//
//The Kotlin standard library contains many functions that work with `Lists`.
//It's educational to implement some of them by hand.
//
//Write a function `findMax()` that finds the maximum value in a `List` of
//*natural numbers* (positive whole numbers). If the `List` is empty, return
//zero. `findMax()` takes `IntList` as a parameter---this is an example class in
//the starter code that only allows you to iterate over a `List`'s contents, get
//its size and access elements by index.
//

main()

fun main(){
    val intList = listOf(5,11,2,10);
    println("Max : ${findMax(intList)}")
}

fun findMax(intList: List<Int>): Int{
    var max = intList[0]
    for(i in intList){
        if(i>max) max = i
    }
    return max
}