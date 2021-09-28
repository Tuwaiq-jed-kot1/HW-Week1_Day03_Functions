fun main(){
    //Question 1
    //Create a function called add() that takes two input numbers and returns the sum of these numbers.
    fun add(num1:Int, num2:Int):Int= num1+num2

    println(add(5,5))

    //Question 2
    //Create a function called fullName() that takes three inputs strings which are first, middle, and last name, and returns the full name.
    println(fullName("Ahmed","Abdullah","Al Waleed"))
}

fun fullName(firstName:String,secondName:String,thirdName:String):String{
    return "$firstName $secondName $thirdName"
}