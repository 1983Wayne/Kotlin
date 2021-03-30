package IntroductoryExercises

const val GIZMO_WEIGHT = 112 // grams
const val WIDGET_WEIGHT = 75 // grams

fun main() {
    println("This program will compute the total weight of your widgets and gizmos. First enter the amount of gizmos below.")
    var gizmoAmount = readLine()?.toInt()

    println("And now input the amount of the widgets below.")
    var widgetAmount = readLine()?.toInt()

    var totalWeight = widgetAmount?.times(WIDGET_WEIGHT)?.let { gizmoAmount?.times(GIZMO_WEIGHT)?.plus(it) }

    println("The total weight for the amount of these widgets and gizmos is " + totalWeight + " grams")
}
