fun main(){
    fun maths(x:Int,y:Int ,mathO : (n1:Int,n2:Int)-> Int){

        println(mathO(x,y))
    }
    maths(2,3) { n1, n2 -> n1 + n2 }
    maths(2,3) { n1, n2 -> n1 - n2 }
    maths(2,3) { n1, n2 -> n1 * n2 }
    maths(2,3) { n1, n2 -> n1 / n2 }

}