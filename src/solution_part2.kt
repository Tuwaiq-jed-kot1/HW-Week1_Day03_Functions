
fun main() {

    //Question 3


    fun max(number1:Int,number2:Int,number3:Int ,mathOperations:(num1:Int,num2:Int,num3:Int)->Int){


        if (number1>number2){
            println("The largest number is $number1")
        }else if (number2>number3){

            println("The largest number is $number2")
        }else{
            println("The largest number is $number3")
        }


        println("$number1 + $number2 + $number3 = ${number1 +number2+number3}")


    }


    max(2,21,16, {num1,num2,num3-> num1 +num2+num3})

    
}



