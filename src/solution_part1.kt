fun add(num1:Int,num2:Int):Int {
    val mathO = num1+num2

    return mathO
}
fun fullName(name1:String,name2:String,name3:String):String{
    val name= "$name1 $name2 $name3"
    return name
}
fun main(){

    println(add(10,12))
    println(fullName("Abdulaziz","Fahad","Alhothali"))
}