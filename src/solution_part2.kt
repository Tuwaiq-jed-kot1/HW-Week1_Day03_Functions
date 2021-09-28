import kotlin.math.max

fun main(){
    println(maximum(5,5,6))
}

val maximum:(x: Int, y: Int, z: Int) -> Int = { x, y, z ->
    if (max(x, y) >= max(y, z)) max(x, y) else max(y, z)
}