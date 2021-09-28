fun main() {
    //----------------------------------Question 3------------------------------------------
    //maximum() is an anonymous function that takes three number as input and return the largest one of these numbers.
    val maximum: (Int, Int, Int) -> String = { num1, num2, num3 ->
        when {
            (num1 > num2 && num1 > num3 || num1 == num2) -> "$num1"
            (num2 > num1 && num2 > num3) -> "$num2"
            else -> "$num3"
        }
    }
    println("The largest number is ${maximum(10, 14, 12)}")

    println("Add ${math(2.0, 3, { Double, Int -> Double + Int })}")
    println("Subtract ${math(2.0, 3, { Double, Int -> Double - Int })}")
    println("Multiply ${math(2.0, 3, { Double, Int -> Double * Int })}")
    println("Divide ${math(2.0, 3, { Double, Int -> Double / Int })}")


//---------------------Challenge 2: Fireball Fuel Level-----------------------------
/*castFireball() is a function return a resulting remaining fuel value that depends on the number of fireballs cast.
The fuel value should be between 1 and 50, with 50 being the maximum amount of fuel in the game.*/

    val castFireball: (Int) -> Int = { numberOfFireballsCast -> 50 - numberOfFireballsCast }
    println("The resulting remaining fuel value is ${castFireball(10)}")

}
//---------------------Challenge 1: Mathematical Operations-----------------------------

/*math() is a function that takes two input numbers and that will do Add, Subtract, Multiply,
and Divide between these two numbers, and "not return the operator's name" with its result.*/
fun math(num1: Double, num2: Int, operations: (Double, Int) -> Double): String {
    return ": ${operations(num1, num2)}"
}




