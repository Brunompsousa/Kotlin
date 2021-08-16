import java.util.*

fun main(){

    //if_else
    fun1()

    //for
    fun2()

    //User input with try_catch
    fun3()

}


fun fun1(){

    val num:Int = (1..20).random() + 10
    val numcheck = if(num>15)"More than 15" else "Less than 15"

    println("Total= $num")
    println("Total= $numcheck")

}
fun fun2(){

    var num = 0
    for (i in 1..25){
        num+=1
        print("$num ")
    }
    println("")

}
fun fun3() {

    try {

        val reader = Scanner(System.`in`)
        print("Enter a number: ")

        val number = reader.nextInt()
        println("You entered: $number")

    } catch (e: Exception){
        println("You did not enter a valid number")
        println("Exception: $e")
    }

}
