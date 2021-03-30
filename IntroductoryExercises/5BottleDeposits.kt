package IntroductoryExercises

fun main() {
    println("Enter below how many bottles greater than 1L you have.")
    var bigBottles = readLine()

    println("Enter below how many bottles less than 1L you have.")
    var smallBottles = readLine()

    var pocketChange =
        (bigBottles?.toDouble()?.times(0.25)!! + (smallBottles?.toDouble()?.times(0.1)!!)).toString()

    println("You have $" + "$pocketChange".format(2))
}
