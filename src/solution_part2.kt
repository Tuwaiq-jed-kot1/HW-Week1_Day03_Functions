//q3

fun main(){

    val maximum= fun(num1:Int , num2:Int , num3:Int):Int{
        if(num1 >= num2 && num1 >= num3)return num1
        if(num2 >= num1 && num2 >= num3)return num2
        return num3
    }
    println(maximum(11,17,9))
}



//ch1

fun main(){
    fun math(num1:Int , num2:Int):String{
        return "Add: "+(num1+num2) + "\nSubtract: "+(num1-num2)+"\nMutiply: "+(num1*num2)+"\nDivide: "+(num1/num2)
    }
    println(math(4,5))
}