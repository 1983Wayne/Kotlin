package IntroductoryExercises

fun main() {

    println("This program will compute the tax and the tip for you restaurant meal.")
    println("Enter the amount below")

    var cost: Double? = readLine()?.toDouble()
    var tax: Double? = cost?.times(0.05)
    var tip: Double? = cost?.times(0.18)
    var grandTotal = cost?.plus(tax!! + tip!!)

    println("The cost for the meal originally is : $cost")
    println("The tax on the meal is: $tax")
    println("The tip on this meal comes to: $tip")
    println("The grand total for this meal is: ${"%.2f".format(grandTotal)}")

}
