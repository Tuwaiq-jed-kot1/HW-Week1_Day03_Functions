fun main() {
    // ## Part III - More Practicing (Optional).
    //Challenge 1: Mathematical Operations
    println(math(2, "+", 3))
    println(math(2, "-", 3))
    println(math(2, "*" , 3))
    println(math(2, "/", 3))

    //Challenge 2: Challenge 2: Fireball Fuel Level
    var fuelValue: Int = 50
    var count:Int = 0
    for (fuelValue >=1 && fuelValue<=15) {
        castFireball(fuelValue)
        castFireball(fuelValue)
        castFireball(fuelValue)
    }


}
fun math(num1:Int,oprStr:String,num2:Int):String {
    var result:Int
    var message:String = ""
    if(oprStr == "+") {
        result = num1+num2
        message = "$num1+$num2=$result"
    }else if(oprStr == "-"){
        result = num1-num2
        message = "$num1-$num2=$result"
    }else if(oprStr == "*"){
        result = num1*num2
        message = "$num1*$num2=$result"
    }else if(oprStr == "/"){
        result = num1/num2
        message = "$num1/$num2=$result"
    }else message="Operation is not one of the following:+,-,* or /"
    return message
}
fun castFireball(fV:Int,counter:Int): Int {

    when (fV>=1 && fV <=15) {
        if ()
    }
    return ""
}