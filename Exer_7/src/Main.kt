fun main(){

    for(i in 1..5) // i>=5
        print("$i ")

    println("")

    for(i in 1 until 5) // i>5
        print("$i ")

    println("")

    for(i in 5 downTo 1) //Begins in 5 and go down to 1 -> i>=1
        print("$i ")

    println("")

    for(i in 0..100 step 10) // Start in 0 and add 10 for each interaction -> i<=100
        print("$i ")

    println("")

    for(i in 100 downTo 0 step 10) // Start in 0 and add 10 for each interaction -> i>=0
        print("$i ")

    println("")

    //Its possible do for with list on Kotlin

    var progLang = listOf<String>("Java", "Kotlin", "C#", "SQL", "JS")
    for (i in progLang)
        print("$i ")

    /*
        Print the variable i because this for work like one foreach where i recieve the current progLang
        if print the progLang the result is all the content of the list 5 times, because the list have 5 elements
     */
        //print(progLang) // print all the content [*List content*]
    /*
        Doing a for with a String the result is that 'i' will recieve one letter each time and you can do some interesting interactions with that
     */

    var text = "What text you want here"
    for (i in text)
        print("$i|")

    //Each time print is called i write the content of the 'i' and the text that as put together
}