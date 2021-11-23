fun main() {
    println(add(10,12))
    println(fullName("Ahmed","Abdullah","Al Waleed"))
}
fun add(int1: Int,int2: Int): Int = int1+int2
fun fullName(str1:String,str2:String,str3:String): String = "$str1 $str2 $str3"