fun main() {

    println (add(10 , 12))
    println(fullName("Ahmed","Abdullah","Al Waleed"))
}

fun add (num1 : Int , num2: Int ) : Int {

    val sum = num1+num2
    return  sum

}


fun fullName(fName : String , lName: String , mName:String) : String {
    val fullName = fName+" " +  lName+" "+ mName
    return fullName

}
