import kotlin.math.max

fun main() {

    //Question 3
    //Create an anonymous function called maximum() that takes three number as input and return the largest one of these numbers.

    val maximum: (num1: Int, num2: Int, num3: Int) -> Int = { num1, num2, num3 ->
        max(num1, max(num2, num3))
    }

    println(maximum(23, 43, 5))
}