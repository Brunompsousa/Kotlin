class Car (_carBrand:String){ //Constructor need a brand to make a car

    //init{ ... } This is call after the object is created, its work like a 2nd contructor
    
    private var isTurnedOn = false  //Verify if the car is on/off
    var speed = 0                   //Speed the car is running
    var brand = _carBrand            //variable that receive the brand from que constructor

    fun startEngine(){
        this.isTurnedOn = true
        println("Brrrr rrr rrr Vroooommmm")
        Thread.sleep(1000) //The execution stop for 'x' seconds before continue (1000 = 1sec)
        println("The engine of your $brand is now running")
        Thread.sleep(1000)
    }

    fun driveCar(speed:Int){
        if(this.isTurnedOn){
            this.speed = speed

            val driveState = when(this.speed){
                in -1 downTo -50 -> "Driving at ${this.speed} km/h on reverse gear"
                0 -> "The car is parked"
                in 1..20 -> "Driving at ${this.speed} km/h on 1th gear"
                in 21..40 -> "Driving at ${this.speed} km/h on 2th gear"
                in 41..60 -> "Driving at ${this.speed} km/h on 3th gear"
                in 61..80 -> "Driving at ${this.speed} km/h on 4th gear"
                else -> "Your light to Check engine is on"
            }
            println(driveState)
        }
        else{
            println("Cant drive with the engine turned off")
        }
        Thread.sleep(1000)
    }

    fun turnOffEngine(){
        println("Attempting to turn of the engine...")
        Thread.sleep(1000)
        if(this.speed == 0 && isTurnedOn){
            isTurnedOn = false
            println("The Engine turned off")
        }
        else{
            println("Cant turn of the engine if the car is still moving at ${this.speed}")
        }
        Thread.sleep(1000)
    }

}

