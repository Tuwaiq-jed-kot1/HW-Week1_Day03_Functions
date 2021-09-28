fun main(){
    //** the answer of question 3**
    println("PART 2: Question 1:")
    val maximum :(Int ,Int ,Int)->Int={ n1,n2,n3 -> maxOf(n1,n2,n3)}
    println("maximum number is ${maximum(10,14,12)} \n")

    // ~~ ** PART 3: the answer of question 1**
    println("PART 3: Question 1:")
    fun math(num1:Int,num2:Double,operation:(Int,Double)->Double)=operation(num1,num2)
    println("Add ${math(2,3.0 ,{num1,num2->(num1+num2)}).toInt()}")
    println("Subtract: ${math(2,3.0 ,{num1,num2->(num1-num2)}).toInt()}")
    println("Multiply ${math(2,3.0 ,{num1,num2->(num1*num2)}).toInt()}")
    println("Divide ${math(2,3.0 ,{num1,num2->(num1/num2)}).toInt()} \n")

    // ~~ ** PART 3: the answer of question 2 **
    println("PART 3: Question 2: ")
    val castFireball :(nOfball:Int)->Int={nOfball-> 50-nOfball}
    val balls= 45
    if(balls <= 50) println("the remaining fireballs : ${castFireball(balls)}")
    else println("the maximum number of balls is 50")
}