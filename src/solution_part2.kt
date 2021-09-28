//Question 3
fun main(){
    fun maximum (x:Int, y:Int, z: Int , maximum   : (n1: Int, n2: Int, n3: Int)->Int){
        println(maximum(10,14,12) )
        if (x>y){
            println("The largest number is 10")

        }
        if (y>x){
            println("The largest number is 14")

        }
        if (z>y){
            println("The largest number is 12")

        }

    }
    maximum(x = 10, y = 14, z = 12){ n1, n2, n3 ->Int.MAX_VALUE}
}




