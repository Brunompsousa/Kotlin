fun main(){

    var num = 10
    var rnum = (1..10).random()
    var lnum = listOf(1,3,6,9)
    var tnum = 5

    println("$num + $rnum = ${num+rnum}")

    println("$tnum")
    tnum += 1
    println("$tnum +=")
    tnum -= 1
    println("$tnum -=")
    tnum *= 2
    println("$tnum *=")
    tnum /= 2
    println("$tnum /=")

    println("----")

    println(tnum++) // tnum--
    println("$tnum ++after")

    println(--tnum) // ++tnum
    println("$tnum --before")

    if(num > rnum)
        println("$num e maior que $rnum")
    else
        println("$rnum e maior que $num")

    if(rnum in lnum)
        println("O $rnum esta na lista de numeros")

    if(rnum !in lnum)
        println("O $rnum nao esta na lista de numeros")

}