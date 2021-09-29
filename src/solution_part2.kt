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

}