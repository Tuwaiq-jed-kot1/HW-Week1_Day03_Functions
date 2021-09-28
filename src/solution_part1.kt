fun main(){
    //Q1
    fun add(x:Int,y:Int){
        println(x+y)
    }
    add(10,12)

    //Q2
    fun fullName(firstN:String , secondName:String,thirdName:String) :String{
        return "$firstN $secondName $thirdName"
    }
    println(fullName("Ahmed","Abdullah","Al Waleed"))
}