fun main(){
    println(math(2,3)) //Q4 function call
    println(castFireball(5.0,3.0)) //Q5 function call (the values must be positive)
}
//Q4 function
fun math(num1:Int, num2:Int) {
    println( "Add: " + (num1 + num2))
    println( "Subtract: " + (num1 - num2))
    println( "Multiply: " + (num1 * num2))
    println( "Divide: " + (num1 / num2))
} //end

//Q5 function
fun castFireball(numOfFireballs:Double,remainingFireballs:Double):Double {
    return ((50 / numOfFireballs) * (remainingFireballs))
} //end