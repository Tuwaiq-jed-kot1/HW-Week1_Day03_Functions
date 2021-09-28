fun main(args: Array<String>) {


    //Question 1
    fun sum(number1: Int, number2: Double): Double {

        return number1 + number2

    }
    println(sum(5, 9.0))


    //Question 2

    fun fullName(fName: String, mName: String, lName: String) {


        println("full name is $fName $mName $lName")

        println("full name is uppercase ${fName.uppercase()} ${mName.uppercase()}  ${lName.uppercase()}")

        println("full name is capitalize: ${fName.capitalize()}  ${mName.capitalize()} ${lName.capitalize()}")
        
        println("full name length : ${fName.length + mName.length + lName.length} ")

    }
    
    fullName("Basil", "Taleb", "ALLluqamni")

}

