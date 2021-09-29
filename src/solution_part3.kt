
//Part III
//Question 4

//Challenge 1: Mathematical Operationss

fun Mathematical_Operations(number1:Int,number2:Int,operation:String, mathOperations:(num1:Int,num2:Int)->Int){

    println(mathOperations(number1,number2))


}

println("Challenge 1: Mathematical Operations")

Mathematical_Operations(2,3,"Add :",{num1,num2-> num1 + num2})

Mathematical_Operations(2,3,"Subtract:",{num1,num2-> num1 - num2})

Mathematical_Operations(2,3,"Multiply :",{num1,num2-> num1 * num2})

Mathematical_Operations(2,3,"Divide :",{num1,num2-> num1 / num2})



//Challenge 2: Fireball Fuel Level



println("please enter fuel between 1 and 50 ")


var fuel: Int = Integer.valueOf(readLine())


val ball = "fireballs "

if (fuel > 0 && fuel <= 50) {

    for (fuel in fuel downTo 1) {

        println("fireballs $fuel")

    }

    if (fuel != 0) {

        println("The fule end ")
    }


} else if (fuel.equals(null)) {
    println(" The fule is null")


} else {
    println("the fuel is not between 1 and 50 ")

}






