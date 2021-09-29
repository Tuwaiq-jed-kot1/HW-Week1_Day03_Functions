fun main(){
    println("The largest number is "+ max(10,14,12))

    //challenge marah albossi
    fun maths(n1:Int, n2:Int, math:(m1:Int, m2:Int) -> Int){
        println(math(2, 3))
    }
    maths(2,3){m1, m2 -> m1 + m2}
    maths(2,3){m1, m2 -> m1 - m2}
    maths(2,3){m1, m2 -> m1 * m2}
    maths(2,3){m1, m2 -> m1 / m2}
}

val max = {a:Int, b:Int, c:Int -> maxOf(a, b, c)}
