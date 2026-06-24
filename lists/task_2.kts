//----------------------------------Exercise 2----------------------------------
//
//Count the number of times a given element occurs in an `IntList`.
//

main()

fun main(){
    countInt(5,listOf(1,5,2,3,2,1,5,5,0,2,3,4,0))
}

fun countInt(int: Int, intList: List<Int>): Unit{
    var matches = 0
    for(i in intList){
        if(i==int) matches++
    }
    println("$int appears $matches times in the list.")
}