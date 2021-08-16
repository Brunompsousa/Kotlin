fun main() {

    //String to Int
    func1()

    //Convert types that go wrong
    func2()

    //Convert number to string to number again
    func3()

}

fun func1(){

    print("Enter a number: ")
    val num = readLine()!!.toInt()
    print("Enter a number: ")
    val num2 = readLine()!!.toInt()

    println("$num + $num2 = ${num+num2}")

}

fun func2(){

    val num = 200
    val num2: Byte = num.toByte()

    println(num2)

}

fun func3(){

    val num = 10
    val textnum = num.toString()
    var fnum = 10f

    println(textnum + 2) //Impossible to do math after convert

    fnum += textnum.toFloat()
    println(fnum)

}