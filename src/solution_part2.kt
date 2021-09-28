fun main(){
    //q3
    val maximum5 =fun(number1: Int,number2: Int, number3: Int): String{
        val x = number1
        val y = number2
        val z = number3
        if(x >y && x > z) {
            return "\"The Largest Number is $x\""
        }
        else if (y >x && y >z){
            return "\"The Largest Number is $y\""
        } else {
            return "\"The Largest Number is $z\""
        }
    }

    val largest = maximum5(10,12,14)
    println(largest)


    //q4
    fun mathAdd(num1:Int, num2:Int, math0 :(n1:Int, n2:Int)-> Int) {
        val x = num1
        val y = num2
        println()
        println("add: "+ math0(x,y))


    }

    mathAdd(2,3) { n1, n2 -> n1 + n2 }

    fun mathSub(num1:Int, num2:Int, math0 :(n1:Int, n2:Int)-> Int) {
        val x = num1
        val y = num2

        println("Subtract: "+ math0(x,y))


    }
    mathSub(2,3) { n1, n2 -> n1 - n2 }

    fun mathMult(num1:Int, num2:Int, math0 :(n1:Int, n2:Int)-> Int) {
        val x = num1
        val y = num2

        println("Multiply: "+ math0(x,y))


    }
    mathMult(2,3) { n1, n2 -> n1 * n2 }

    fun mathDiv(num1:Int, num2:Int, math0 :(n1:Int, n2:Int)-> Int) {
        val x = num1
        val y = num2

        println("Divide: "+ math0(x,y))

    }
    mathDiv(2,3) { n1, n2 -> n1 / n2 }
}