package IntroductoryExercises

import kotlin.math.*

fun main() {
    println("This program will perform various artihmetical operations on two integers.  Enter the first below: ")
    var intA: Int? = readLine()?.toInt()


    println("The first integer is $intA, now enter the second integer below.")
    var intB: Int? = readLine()?.toInt()


    println("Ok so with integer $intA as 'A' and integer $intB as 'B' we have: ")

    if (intA != null && intB != null) {
        println("The sum of A + B = ${intA + intB!!}")
        println("The difference of A - B = ${intA - intB!!}")
        println("The product of A(B) = ${intA * intB!!}")
        println("The quotient of A/B = ${intA / intB!!}")
        println("The remainder of A % B = ${intA % intB!!}")
        println("The result of log A = ${log10(intA!!.toDouble())}")
        println("The result of a^b = ${intA.toDouble().pow(intB!!)}")

    }

}
