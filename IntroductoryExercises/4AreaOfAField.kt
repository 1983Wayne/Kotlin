package IntroductoryExercises

const val acre = 43560 // Square feet

fun main() {
    println("This program calculates the area of a field in acres.  Enter the length of the field in feet below")
    var length = readLine()?.toInt()

    println("Also, enter below the width in feet")
    var width = readLine()?.toInt()

    var area = (width?.let { length?.times(it) })?.div(acre)
    println("The total acres of this land area is $area acres")
}
