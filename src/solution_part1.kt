fun main()
{
    println(add(10,12)) //Q1 function call

    println(fullName("Ahmed","Abdullah","Al Waleed")) //Q2 function call
}

//Q1 function
fun add(num1:Int,num2:Int):Int{
    return num1+num2
} //end


//Q2 function
fun fullName(firstName: String, middleName:String, lastName:String):String {
    return "$firstName $middleName $lastName"
} //end