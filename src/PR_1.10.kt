class Car(var type: String, var model: Int, var price: Double, var owner: String, var milesDriven: Int){
    init {
        println("Object of class is created and Init is called.")
    }
    fun currentprice(): Double {
        return price - (milesDriven * 10)
    }
    fun info() {
        println("Car Information: $type, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDriven")
        println("Original Car Price: $price")
        println("Current Car Price: ${currentprice()}")
        println()
    }
}

fun main(){
    println("Creating Car Class Object car1 in next line")
    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105)
    car1.info()

    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20)
    car2.info()

    println("ArrayList of Car:")
    val carList = ArrayList<Car>()
    carList.add(Car("Toyota", 2017, 1080000.0, "KJS", 100))
    carList.add(Car("Maruti", 2020, 4000000.0, "NPP", 200))

    for (i in carList) {
        i.info()
    }

}