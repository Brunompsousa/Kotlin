fun main(){

    val outerClass1 = OuterClass1.Nested()
    outerClass1.printM("Hello")
    // outerClass1.apple    -> This is impossible

    val outerClass11 = OuterClass1()
    // outerClass11.Nested().printM("Hello")   -> This is impossible

    val outerClass2 = OuterClass2().Nested()
    outerClass2.printM()
    // outerClass2.apple    -> This is impossible

    val outerClass3 = OuterClass2()
    outerClass3.Nested().printM()
    //Creating a OuterClass2 it's possible to access the nested class because is a INNER class
}

class OuterClass1(){
    val apple = "Apple"
    val number = 25

    class Nested(){

        //Inside this class we don't have access to OuterClass1

        fun printM(message: String){
            println(message)
        }
    }
}

class OuterClass2(){
    val apple = "Apple"
    private val number = 25

    inner class Nested(){

        //Inside this class we have access to all content of Outerclass2 even being private

        fun printM(){
            println("I have $number $apple")
        }
    }
}