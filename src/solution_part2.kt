import kotlin.math.max

fun main(){
    val maximum: (Int, Int, Int) -> Any ={ n1, n2, n3 ->
        if (n1>n2 && n1>n3) "The largest number is $n1"
        else if (n2>n1 && n2>n3) "The largest number is $n2"
        else if (n3>n1 && n3>n2)"The largest number is $n3"
        else "null"

    }
    println( maximum(10,14,12))
}