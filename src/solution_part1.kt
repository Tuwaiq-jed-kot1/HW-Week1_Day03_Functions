fun main(){


    //funcation 1

    fun add(a: Int , b :Int): Int {

        return a + b
    }
    println("the resulat of add is ${ add(10,12)}")

  // function 2

    fun FullName(frist: String, sconde: String, thied: String): String {

        val fullname =  frist + sconde + thied

        return fullname
    }

    val fullname = FullName("Ahmed  ", "Abdullah", "Al Waleed")

    print( fullname )

}