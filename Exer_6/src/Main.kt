fun main(){
    //Switch on kotlin change to WHEN

    //When with number and strings
    func1()

    //When with intervals
    func2()

    //When more specific
    func3()

    //When with 'is type'
    func4()

}

fun func1() {

    try {
        print("Enter a number: ")
        var number = readLine()!!.toInt()

        print("Enter a second number: ")
        var number2 = readLine()!!.toInt()

        print("Enter an operator (+,-,*,/): ")
        var op = readLine()!!

        val result = when(op){
            "+" -> "$number + $number2 = ${number+number2}"
            "-" -> "$number - $number2 = ${number-number2}"
            "*" -> "$number * $number2 = ${number*number2}"
            "/" -> "$number / $number2 = ${number/number2}"
            else -> "$op is not recognised"
        }

        println(result)
    } catch (e: Exception){
        println("Problem with the input")
        println("Exception: $e")
    }

}
fun func2(){

    val numR = (1..10).random()

    when(numR){
        in 1..5-> println("The number is less than 6")
        in 6..10-> println("The number is between 6 and 10(inclusive)")
    }
}
fun func3(){

    val numR = (1..10).random()

    /*Its possible to use this with strings or other values

        "x","y" -> do something

     */

    when(numR){
        1,5-> println("1 or 5")
        6,10-> println("6 or 10")
    }

}
fun func4(){

    var num =(1..10).random()
    var x = if(num > 6)
                "Hello"         //Save the String "hello"
            else if (num < 3)
                (1..2).random() //Put the value 1 or 2 on num
                else
                    listOf(1,2,3)

    when(x){
        is Int ->{
            when(x){
                1-> println("Hello")
                2-> println("Goodbye")
            }
        }
        is String -> println(x.length + 1)
        is List<*> -> print(x)
    }
}