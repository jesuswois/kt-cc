// ----------------------------------Exercise 1----------------------------------

// Using a `while` loop, write a function `displayContent()` that takes a
// `String` parameter and displays each character on its own line.

fun main(){
    displayContent("Holaa")
}

fun displayContent(text: String){
    var i = 0;
    while(i<text.length){
        println(text[i]);
        i++;
    }
}