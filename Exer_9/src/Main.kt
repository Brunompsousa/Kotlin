fun main(){

    //Create a object
    val car = Car("BMW")

    car.startEngine()
    car.driveCar(10)
    car.driveCar(30)
    car.driveCar(80)
    car.turnOffEngine()
    car.driveCar(0)
    car.turnOffEngine()

}