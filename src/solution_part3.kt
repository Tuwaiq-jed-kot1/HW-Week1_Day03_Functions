fun main() {
    //Challenge 1: Mathematical Operations
    //Create a function called math() that takes two input numbers and that will do Add, Subtract, Multiply, and Divide between these two numbers, and return the operator's name with its result.

    fun mathematics(operator: String, math: (num1: Int, num2: Int) -> Int) {
        val output = math(3, 6)
        println("$operator= $output")
    }

    mathematics("Add") { num1, num2 -> num1 + num2 }
    mathematics("Subtract") { num1, num2 -> num1 - num2 }
    mathematics("Multiply") { num1, num2 -> num1 * num2 }
    mathematics("Divide") { num1, num2 -> num1 / num2 }

    println()

    //Challenge 2: Fireball Fuel Level
    //Casting fireballs does not just print a message to the console.
    // While NyetHack fireballs are strong, the player should not be able to cast an unlimited amount of them.
    // Make the castFireball() function return a resulting remaining fuel value that depends on the number of fireballs cast.
    // The fuel value should be between 1 and 50, with 50 being the maximum amount of fuel in the game.

    var fuel: Int = MAX_FUEL
    //player use castfireball attack against enemy
    //assuming:
    //player is at max fuel=50
    //each attack cost 1 fuel
    //made a loop to test that player can't castfireball if they don't have enough fuel
    while (true) {
        if (fuel >= 1) {
            fuel = castFireball(fuel)
            println("player casted a fireball (remaining fuel:$fuel)")
            println("note: each fireball cost 1 of fuel\n")
        } else {
            println("can't cast a fireball (fuel:$fuel)")
            break
        }
    }

}

const val MAX_FUEL: Int = 50
fun castFireball(fuel: Int): Int {
    return fuel - 1
}