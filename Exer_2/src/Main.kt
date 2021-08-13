import kotlin.math.roundToInt

var item = "Hammer"
//var item:String = "Hammer"
val item2 = "Apple"
var number = 3.1415f

var number2: Double = 15.1
var number3: Float = 1.52f

fun main() {
    item = "Carrot"
    println(item)
    //item2 = "Carrot"  Não se pode fazer isto pois val e como se fosse final em java. Nao podemos fazer override.
    println(item2)
    println(number)

    var tot = number2 + number3
    println("%.2f".format(tot))
}