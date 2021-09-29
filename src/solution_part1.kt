//## Part I - Practice with functions.

fun main(){
    println("Output : "+add(20,6))
    fullName("Hani","Ali","Dabash")
}

// this function is to Add two numbers and return the result as Int ..
fun add(num1:Int , num2:Int):Int{
    return num1+num2
}

//this is function is to create a full name out of three string ..
fun fullName(firstName:String , secondName:String , thirdName:String):Unit{
    println("$firstName $secondName $thirdName")
}




