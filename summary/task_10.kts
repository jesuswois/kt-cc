// ---------------------------------Exercise 10----------------------------------

// Create a function `showSnake(rows: Int, columns: Int)` that displays a table
// filled with sequential numbers in a form of snake. For example, `showSnake(3,
// 3)` should produce the following:

//  0 1 2
//  5 4 3
//  6 7 8

// For proper alignment, use `"%3d".format(number)` to place any necessary spaces
// before the number.

main()

fun showSnake(rows: Int, columns: Int) {
  val width = (rows * columns) - 1;
  var reversed: Boolean = false;
  var currentNumber = 0;
  for(row in 1..rows){
      var rowLine = "";
      startingNumber = currentNumber;
      for(column in startingNumber..startingNumber+columns) {
          if(!reversed){
              rowLine = rowLine + ("%${width}d").format(column);
          } else {
              rowLine = ("%${width}d").format(column) + rowLine;
          }
          currentNumber++;
      }
      print(rowLine);
      println("");
      reversed = !reversed;
  }
}

fun main() {
  showSnake(2, 3)
  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/