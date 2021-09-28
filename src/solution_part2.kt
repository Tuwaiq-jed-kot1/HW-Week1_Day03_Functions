import kotlin.math.max

fun main() {

    println(maximum(10,14,12))
}

val maximum : (Int,Int,Int) -> Unit = { x , y , z ->
     println( if (x>y && x>z ) { println(" The largest number is $x " ) }

             else if (y >x && y>z ) { println(" The largest number is  $y" ) }

                else {
         println(" The largest number is $z") } )
     }

