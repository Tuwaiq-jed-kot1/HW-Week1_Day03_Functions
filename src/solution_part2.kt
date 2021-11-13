fun main() {
    println(maximum(10,14,12)) //Q3 function call
}

//Q3 Anonymous function
val maximum: (Int, Int, Int) -> String = {num1, num2, num3 -> "the largest number is " + maxOf(num1,maxOf(num2,num3))} //end
