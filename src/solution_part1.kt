fun main(){
    println(add(5, 6))

    println(fullName("Musab", "Abdullah", "Alghamdi"))
}

fun add(x: Int, y: Int): Int{
    return x + y
}

fun fullName(first: String, second: String, third: String): String{
    return "$first $second $third"
}