fun castFireball(fuelLevel:Int): String {
    val castFireball = when (fuelLevel){
        in 41..50-> "it is full"
        in 31..40->"it is good"
        in 21..30-> "it is low"
        in 11..20-> "it is fumes"
        in 1..10-> "it is empty"

        else -> "out of range"

    }
    return castFireball
}

fun main(){
    println(castFireball(45))
}