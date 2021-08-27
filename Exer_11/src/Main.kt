open class Person(_name: String, _age: Int){

    val applePrice = 10

    init {
        println("My name is $_name")
        println("My age is $_age")
    }

    open fun walk(){
        println("Walking is good for your health!")
    }
}

class Theacher(_name:String, _age: Int):Person(_name, _age){

    fun mathCalc(){

        println("I am a teacher and i love my students")
        println("the price of an apple is ${(applePrice * .10).toInt()}€")
    }
}

class BusinessMan(_name:String, _age: Int):Person(_name, _age){

    fun doBusiness(){

        println("I am a business man and i like to do business")
        println("The price os an apple box is $applePrice€")

    }

    override fun walk() {
        super.walk() //Call the walk() funcion on Person first
        println("I added some code to this walk() function")
    }

}

fun main(){

    val theacher1 = Theacher("jose",46)
    theacher1.mathCalc()

    println("\n----")

    val businMan1 = BusinessMan("Oscar",58)
    businMan1.doBusiness()

    businMan1.walk()

}
