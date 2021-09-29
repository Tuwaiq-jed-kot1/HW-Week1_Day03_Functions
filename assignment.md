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
```sh
fun main() {
   println(add(10,12))
}
Output: 22
```
### Question 2
Create a function called `fullName()` that takes three inputs strings which are first, middle, and last name, and returns the full name.
```sh
fun main() {
   println(fullName("Ahmed","Abdullah","Al Waleed"))
}
Output: "Ahmed Abdullah Al Waleed"
```

## Part II - Practice with Anonymous Functions (Optional).
---
### Question 3
Create an anonymous function called `maximum()` that takes three number as input and return the largest one of these numbers.
```sh
fun main() {
    println(maximum(10,14,12))
}

Output: "The largest number is 14"
```

## Part III - More Practicing (Optional).
---
### Challenge 1: Mathematical Operations
Create a function called `math()` that takes two input numbers and that will do Add, Subtract, Multiply, and Divide between these two numbers, and return the operator's name with its result.
```sh
fun main() {
   println(math(2,3))
}
Output: 
        Add: 5
        Subtract: -1
        Multiply: 6
        Divide: 0 
```

### Challenge 2: Fireball Fuel Level
Casting fireballs does not just print a message to the console. While NyetHack fireballs are strong, the
player should not be able to cast an unlimited amount of them. Make the `castFireball()` function return
a resulting remaining fuel value that depends on the number of fireballs cast. The fuel value should be
between 1 and 50, with 50 being the maximum amount of fuel in the game.
  