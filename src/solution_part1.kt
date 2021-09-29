fun main(){

    println(add(10, 12))
    println(fullName("Ahmed","Abdullah","Al Waleed"))
}

fun add(num1:Int, num2:Int): Int{
    return num1 + num2
}

fun fullName(fName: String, mName: String, lName: String): String {
    return "$fName $mName $lName"
}
