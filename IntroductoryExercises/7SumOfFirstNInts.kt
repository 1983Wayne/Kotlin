package IntroductoryExercises

fun main() {
    println("This program will add up all the integers from one to your input number below")

    var userInput = readLine()?.toInt()
    var addition = (userInput?.times((userInput + 1)))?.div(2)

    println("The total of all these additions equals " + addition)
}
