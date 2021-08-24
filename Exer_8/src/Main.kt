fun main(){

    addNum1(5,6) // Its not mandatory give the String because in the function it have a default value
    println("-----")
    addNum1(3,6,"Change message") // The message String is override with the text that as sended
    println("-----")
    addNum2(5,9) // if the function dont have prints on it and return a value it is better put the return value on some var/val if needed or the value is lost
    println("-----")
    println(addNum2(2,7)) //Print the return value
    println("-----")
    addNum1(n2 = 5,n1 = 1) // Its possible give value with different order from the function, but its necessary give que variable name before the value
    println("-----")
    println(rollfunc(4))
    println("-----")
}

private fun addNum1(n1:Int,n2:Int,message:String = "Default message"){

    println("$n1 + $n2 = ${n1 + n2}")
    println(message)

}

//Function with return value
private fun addNum2(n1:Int,n2:Int) : Int{

    var total = n1 + n2
    println("$n1 + $n2 = total")
    return n1 + n2 //Can return total on the calc and that is done before return

}

private fun rollfunc(n1:Int):Int{
    return if(n1 == 1) {
        println("$n1\n")
        println("Recursion end")
        n1 //value for the return
    }
    else{
        print("$n1+")
        n1 + rollfunc(n1-1) //call the function again like a loop but reduce 1 on 'n1'
    }
}