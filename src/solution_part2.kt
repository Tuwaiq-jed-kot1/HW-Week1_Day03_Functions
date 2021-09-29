
val maximum:(a:Int,b:Int,c:Int) -> Int= { a,b,c ->
    max(a, max(b,c))

}

fun main(){

    println(maximum(10,14,12))

}