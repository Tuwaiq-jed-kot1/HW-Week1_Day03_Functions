// ## Part III - More Practicing (Optional).


val maxFuel : Int = 50
var fuel : Int = 6

fun main(){
    math(4.0,2.0)
    println("---------------------------")
    castingFireball(8)
}

// this function works as a simp[le calculator to Add , Sub , Multiply , Devide two numbers ..
fun math(num1:Double , num2:Double){
    println("Output :")
    println("Add : " + (num1+num2))
    println("Subtract : " + (num1-num2))
    println("Multiply : " + (num1*num2))
    println("Devide : " + (num1/num2))
}

// this function will take the number of casting from player and check if there is fuel of not to cast fireballs ..
fun castingFireball(numberOfCasting:Int){
    for(i in 0..numberOfCasting){
        if(fuel > 0){
            println("Casting Fireball , Booooom ❂")
            fuel -= 1
        }else{
            println("Sorry there is no fuel , You are dead ☠")
        }
    }
}