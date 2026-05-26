// ----------------------------------Exercise 5----------------------------------

// Implement `everyFifth()` to display every fifth number in the given range. For
// example, `everyFifth(11, 30)` displays the numbers `15`, `20`, `25`, and `30`.

fun main(){
    everyFifth(11,30)
}

fun everyFifth(startingValue: Int, endingValue: Int) {
    var first: Boolean= true
    for(value in startingValue..endingValue){
        if(value%5==0 && first){
            print(value.toString())
            first = false
            continue;
        }
        if(value%5==0) print(", "+value.toString())
    }
}