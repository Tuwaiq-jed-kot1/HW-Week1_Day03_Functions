fun main(){

    //Part2-Q3
    val findMax =fun(num1: Int,num2: Int, num3: Int): String{
        if(num1 >num2 && num1 > num3) {
            return "The Largest Number is $num1"
        }
        else if (num2 >num1 && num2 >num3){
            return "The Largest Number is $num2"
        }
        else if(num3 > num1 && num3 > num2){
            return "The Largest Number is $num3"
        }
        else {
            return "Error, can not compute"
        }
    }

    val result = findMax(10,12,14)
    println(result)

    //-------------------------------------------------------------------//

    //Part3-Challenge
    fun Adding(num1:Int, num2:Int, math0 :(a:Int, b:Int)-> Int) {
        val x = num1
        val y = num2
        println()
        println("add: "+ math0(x,y))
    }

    Adding(2,3) { a, b -> a + b }

    fun subtracting(num1:Int, num2:Int, math0 :(a:Int, b:Int)-> Int) {
        val x = num1
        val y = num2

        println("Subtract: "+ math0(x,y))
    }
    subtracting(2,3) { a, b -> a - b }

    fun multiplication(num1:Int, num2:Int, math0 :(a:Int, b:Int)-> Int) {
        val x = num1
        val y = num2

        println("Multiply: "+ math0(x,y))
    }
    multiplication(2,3) { a, b -> a * b }

    fun division(num1:Int, num2:Int, math0 :(a:Int, b:Int)-> Int) {
        val x = num1
        val y = num2

        println("Divide: "+ math0(x,y))
    }
    division(2,3) { a, b -> a / b }


}