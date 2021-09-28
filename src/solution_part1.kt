/*
Name : Husam Talal Metro
HomeWork : HW-Week1_Day03_Functions
*/

fun main() {
    // Question 1 call
    println(add(10, 12))

    //---- Println To leave line between the Answers ----
    println()

    // Question 2 call
    println(fullName("Ahmed", "Abdullah", "Al Waleed"))
}

// Solution for Q1 -- Function to add numbers and return Int
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

// Solution for Q2 -- Function to merge 3 Strings and return a String for
fun fullName(str1: String, str2: String, str3: String) = "$str1 $str2 $str3"