
//Part III
//Question 4

//Challenge 1: Mathematical Operationss

fun Mathematical_Operations(number1:Int,number2:Int, mathOperations:(num1:Int,num2:Int)->Int){

    println(mathOperations(number1,number2))


}

println("Challenge 1: Mathematical Operations")

Mathematical_Operations(2,3,{num1,num2-> num1 + num2})

Mathematical_Operations(2,3,{num1,num2-> num1 - num2})

Mathematical_Operations(2,3,{num1,num2-> num1 * num2})

Mathematical_Operations(2,3,{num1,num2-> num1 % num2})



//Challenge 2: Fireball Fuel Level


