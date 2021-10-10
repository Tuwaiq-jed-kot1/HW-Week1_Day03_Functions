# Kotlin Essentials II - Assignment
---
The Kotlin assignment has three components:
- Part I: Practice with functions.
- Part II: Practice with Anonymous Functions (Optional).
- Part III: More Practicing (Optional).

> Note: You must save your solution as `solution_part1.kt` for Part I, and `solution_part2.kt` for Part II.

## Instructions
---
We'll be working through problems designed to get more practice with the concepts covered during the previous lesson (Variables, Conditionals).

## Part I - Practice with functions.
---
### Question 1
Create a function called `add()` that takes two input numbers and returns the sum of these numbers.
val Number1 = 10
val Number2 = 12
val Result : Int
fun add(Number1: Int,Number2: Int): Int{
val addingSum = Number1 + Number2
return addingSum    }
Result = add(Number1,Number2)
println("The Result is = $Result")
### Question 2
Create a function called `fullName()` that takes three inputs strings which are first, middle, and last name, and returns the full name.
Fun main() {
val firstname = "Ahmed "
val secondname = "Abdullah "
val thirdname = "Al Waleed"
fun fullName(firstname: String, secondname: String, thirdname: String): String {
val completeName = firstname + secondname + thirdname
return completeName
}
println(fullName(firstname, secondname, thirdname))
}

## Part II - Practice with Anonymous Functions (Optional).
---
### Question 3
Create an anonymous function called `maximum()` that takes three number as input and return the largest one of these numbers.
fun main(){
val findMax =fun(numberOne: Int,numberTwo: Int, numberThree: Int): String{
if(numberOne > numberTwo && numberOne > numberThree) {
return "The Largest Number is $ numberOne "
}
else if (numberTwo > numberOne && numberTwo > numberThree){
return "The Largest Number is $ numberTwo "
}
else if(numberThree > numberOne && numberThree > numberTwo){
return "The Largest Number is $ numberThree "
}
else {
return "Error, not compute"
}
}

val result = findMax(10,12,14)
println(result)

## Part III - More Practicing (Optional).
---
### Challenge 1: Mathematical Operations
Create a function called `math()` that takes two input numbers and that will do Add, Subtract, Multiply, and Divide between these two numbers, and return the operator's name with its result.
fun Adding(numberone:Int, numbertwo:Int, math0 :(c:Int, d:Int)-> Int) {
val x = numberone
val y = numbertwo
println()
println("add: "+ math0(x,y))
}
Adding(2,3) { c, d -> c + d }
fun subtracting(numberone:Int, numbertwo:Int, math0 :( c:Int, d:Int)-> Int) {
val x = numberone
val y = numbertwo

       println("Subtract: "+ math0(x,y))
}
subtracting(2,3) { c, d -> c - d }

fun multiplication(numberone:Int, numbertwo:Int, math0 :( c:Int, d:Int)-> Int) {
val x = numberone
val y = numbertwo
println("Multiply: "+ math0(x,y))
}
multiplication(2,3) { c, d -> c * d }
fun division(numberone:Int, numbertwo:Int, math0 :( c:Int, d:Int)-> Int) {
val x = numberone
val y = numbertwo
println("Divide: "+ math0(x,y))
}
division(2,3) { c, d -> c / d }
}