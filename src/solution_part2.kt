fun main(){

    // Part II Question 3


    println(maximum(10,14,12))
    // Output should be "The largest number is 14"

}
//====================  Anonymous Functions ======================================

    val maximum= { num1:Int,num2:Int,num3:Int ->

        if(num1>num2 && num1>num3) {
            "The largest number is $num1"
        }else if(num2>num1 && num2>num3){
            "The largest number is $num2"
        }else if(num3>num1 && num3>num2){
            "The largest number is $num3"
    }else {
        "There is tow number or more is equals"
        }
    }


