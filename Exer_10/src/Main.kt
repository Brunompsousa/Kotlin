fun main(){

    val b = Guy()
    b.actualAge = 15
    b.age = 15
    println("b actual age is ${b.actualAge}")
    println("b pretend age is ${b.age}")

}

class Guy(){

    var actualAge: Int = 0
    var age: Int = 0
        //This get/set is used when an object.age is called
    get() {
        println("> age has been accessed")
        return field
    }
    set(value) {
        field = when{
            value <18 -> 18
            value in 18..30 -> value
            else -> value-3
        }
        println("> age as been set")
    }

}