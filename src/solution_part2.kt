import kotlin.math.max

fun main(){
    val maximum: (x: Int, y: Int, z: Int) -> Int = { x, y, z ->
        max(x , max(y , z))
    }
    println("the maximum number is: " + maximum(10 ,14 , 12))
}