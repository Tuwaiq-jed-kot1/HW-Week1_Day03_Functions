fun main(){

    //q1
    fun add(num1: Int, num2: Int): Int {
        val x = num1
        val y = num2
        return x+y
    }

    println(add(10,12))

    //q2
    fun fullName(fname: String, mname: String, lname: String): String = "\"$fname $mname $lname\""


    println(fullName("Ahmed","Abdullah","Al Waleed"))


}