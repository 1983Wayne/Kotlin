package IntroductoryExercises

var year = 1 // How many years you're on.  The program goes up to 3 years
var userAmount = 0.00
var howManyYears = 3

fun main() {
    println("This program will calculate annually paid interest at 4% per year " +
            "for your savings amount. Enter below the amount.")
  
    userAmount = readLine()?.toDouble()!!

    while (year <= howManyYears) {
        if (userAmount != null) {
            change(userAmount)
        }
    }
}

fun change(amount: Double) {
    var newAmount = amount?.times(1.04)
    println("For year $year you have $newAmount dollars.")

    year += 1
    userAmount = newAmount

}
