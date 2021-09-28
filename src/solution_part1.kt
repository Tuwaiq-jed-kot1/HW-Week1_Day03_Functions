fun main(){
   // function called `add()` that takes two input numbers and returns the sum of these numbers.
   fun add(n1:Int,n2:Int) :Int{
      var sum=n1+n2
       return  sum
   }

   println(add(10,12))

   //Create a function called `fullName()` that takes three inputs strings which are first, middle, and last name, and returns the full name.
fun fullName(fName:String ,mName:String , lName:String){

   println("$fName $mName $lName ")
}

   println(fullName("Ahmed","Abdullah","Al Waleed"))
}