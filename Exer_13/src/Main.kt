fun main(){

    // Objects can be used without instantiate
    println(Number.text)
    Number.helloFriend()

    // Companion objects can be used like objects without instantiate the class where they are
    Apple.randomNumber()

    var apple = Apple()
    apple.fruit()

}

class Apple{

    //Companion objects
    companion object{

        private var x = 0
        private var y = 30

        fun randomNumber(){
            val random = (x..y).random()

            println("Random number = $random")
        }
    }

    fun fruit(){

        x = 50
        y = 100
        randomNumber()

    }

}