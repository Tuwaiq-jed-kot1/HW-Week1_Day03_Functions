fun main(){
    print(maximum(10,14,12))
    print(maximum(20,14,12))
    print(maximum(20,14,30))
    print(maximum(10,10,12))
    print(maximum(0,10,10))
    print(maximum(9,0,9))
}
val maximum:(num1:Int,num2:Int,num3:Int) -> String = {num1,num2,num3 ->
        var max = num1
    if (max<num2)
        max=num2
    if (max<num3)
        max=num3

    if(num1 == num2 || num1 == num3 || num2 == num3)
        "Two or more of the given numbers are equal.\n"
    else
        "The largest number is $max.\n"
}