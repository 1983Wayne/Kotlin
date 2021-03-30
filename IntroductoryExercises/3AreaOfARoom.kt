package IntroductoryExercises

fun main() {
    println("This is a program to calculate the area of a room.  Please enter the width below")
    var width = readLine()?.toDouble()

    println("Please also input the length of the room below")
    var length = readLine()?.toDouble()
    var area = width?.times(length!!)

    println("Your room has ${"%.2f".format(area)} square units of area")
}
