
fun main() {

    // Part I - Question 1
    println(add(10, 12))
    // Output should be 22

//-------------------------------------

   // Part I - Question  2

    println(fullName("Ahmed", "Abdullah", "Al Waleed"))
    //Output should beAhmed Abdullah Al Waleed

}
//             ================= function ====================================
// for Question 1
fun add(firstNum: Int, secondNum: Int): Int {
    return firstNum + secondNum
}
// for Question 2
fun fullName(firstName:String, middleName:String,lastName:String): String {
    return "$firstName $middleName $lastName"

}

