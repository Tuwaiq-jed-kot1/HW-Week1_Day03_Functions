import kotlin.random.Random

/*
Name : Husam Talal Metro
HomeWork : HW-Week1_Day03_Functions
 */
fun main() {
    //----------------------------------------Part Two----------------------------------------//
    // Question 3 anonymous function maximum(num1,num2,num3) takes three numbers and returns max number in a String
    val maximum: (num1: Int, num2: Int, num3: Int) -> String = { num1, num2, num3 ->
        var max = num1
        if (num2 > max) {
            max = num2
        }
        if (num3 > max) {
            max = num3
        }
        "The largest number is $max"
    }
    // Solution for Q3 -- calling the maximum(num1,num2,num3)
    println(maximum(10, 14, 12))

    //---- Println To leave line between the Answers ----
    println()

    //----------------------------------------Part Three----------------------------------------//
    // Challenge 1 Answer
    println(math(2, 3))

    //---- Println To leave line between the Answers ----
    println()

    // Challenge 2 Answer
    var remainingFuel: Int = Random.nextInt(1, 51) // generate random Int number from 1 to 50
    // you can uncomment the following if you want to cast Fireball until remaining Fuel is Empty == 0
    /*while (remainingFuel > 0)
        remainingFuel = castFireball(remainingFuel)*/
    remainingFuel = castFireball(remainingFuel)
}

// Challenge 1 Function
fun math(num1: Int, num2: Int) =
    "Add: ${num1 + num2}\nSubtract: ${num1 - num2}\nMultiply: ${num1 * num2}\nDivide: ${num1 / num2}"

// Challenge 2 Function
fun castFireball(currentFuel: Int): Int {
    if (currentFuel > 0) {
        println("--- Fireball is Casted --- remaining Fuel = ${currentFuel - 1} ---")
        return currentFuel - 1
    }
    println("--- Your Casting Fuel is Empty ---")
    return currentFuel
}


