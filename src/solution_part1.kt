fun main() {

    println(add(10, 12))
    println(fullName("Ahmed", "Abdullah", "Al Waleed"))

}

//----------------------------------Question 1------------------------------------------
// add() is a function that takes two input numbers(num1, num2) and returns the sum of these numbers.
fun add(num1: Int, num2: Int): Int {
    return num1 + num2

}

//----------------------------------Question 2------------------------------------------
// fullName() is a function that takes three inputs strings which are first, middle, and last name, and returns the full name.
fun fullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"

}
