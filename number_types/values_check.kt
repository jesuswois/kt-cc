// ----------------------------------Exercise 2----------------------------------

// Check which of the following values can't be stored in an `Int` type:

// - A million (10^6^)
// - A billion (10^9^)
// - A trillion (10^12^)
// - A quintillion (10^18^)

fun main(){
    val store_1: Int = 1_000_000;
    val store_2: Int = 1_000_000_000;
    val store_3: Long = 1_000_000_000_000;
    val store_4: Long = 1_000_000_000_000_000_000;
    println("store_1: $store_1");
    println("store_2: $store_2");
    println("store_3: $store_3");
    println("store_4: $store_4");
}