import kotlin.random.Random

fun main() {


    println("Question 3")


    var number1 = Random.nextInt(0, 100)
    var number2 = Random.nextInt(0, 100)
    var number3 = Random.nextInt(0, 100)
    max(number1, number2, number3, { num1, num2, num3 -> num1 + num2 + num3 })


}


fun max(number1: Int, number2: Int, number3: Int, mathOperations: (num1: Int, num2: Int, num3: Int) -> Int) {


    if (number1 > number2) {
        println("The largest number is $number1")
    } else if (number2 > number3) {

        println("The largest number is $number2")
    } else if (number1 == number2 || number2 == number3 || number1 == number3) {
        println("There are two numbers equal ")
    } else {

        println("The largest number is $number3")

    }




    println("$number1 + $number2 + $number3 = ${number1 + number2 + number3}")


}
