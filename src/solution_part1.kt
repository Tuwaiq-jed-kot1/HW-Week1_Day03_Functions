fun main(){

    // Part1-Q1
    val Num1 = 10
    val Num2 = 12
    val Result : Int
    fun add(Num1: Int,Num2: Int): Int{
       val addingSum = Num1 + Num2
        return addingSum

    }
    Result = add(Num1,Num2)
    println("The Result is = $Result")

    //------------------------------------------//

    //Part1-Q2

    val name1 = "Ahmed "
    val name2 = "Abdullah "
    val name3 = "Al Waleed"
    fun fullName(name1: String,name2: String, name3: String): String {
        val completeName = name1 + name2 + name3
        return completeName
    }
    println(fullName(name1, name2, name3))
}