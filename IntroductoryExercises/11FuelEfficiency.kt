package IntroductoryExercises

val conversionFactor = 235.214583

fun main() {
    println("This program will convert miles per gallon into L per 100 km or vice-versa.")
    println("If you want to go from MPG to L/100km, type 'm' below.  Otherwise, type 'l'.")

    var conversion: String? = readLine()
    if (conversion == "m") {
        conversion = "Liters Per 100 km"
    }
    else if (conversion == "l") {
        conversion = "Miles Per Gallon"
    }
    else {
        println("Sorry, that is an incorrect value.  Try again later!")
        return
    }
    println("How much did you want to convert?")
    var amountOfUnits = readLine()?.toDouble()

    println("You're getting ${conversionFactor / amountOfUnits!!} $conversion")
}
