fun findCar(): String {
    val maxSpeed = readln().toInt()
    val accTime = readln().toInt()
    // write your code here
    if (maxSpeed < 120 || accTime !in 1..4) throw Exception("The race can't be won with this car")
    else return "I will definitely win!"
}