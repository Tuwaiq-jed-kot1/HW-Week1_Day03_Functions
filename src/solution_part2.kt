//## Part II - Practice with Anonymous Functions (Optional).
fun main(){
    println(maximum(3,20,7))
}
// this function will return the maximum number out of three numbers ..
fun maximum(num1:Int,num2:Int,num3:Int) : Int{
    var max = num1
    if(num2 > max){
        max = num2
        if(num3 > max){
            max = num3
        }
    }else if(num3 > max){
        max = num3
    }
    return max
}

