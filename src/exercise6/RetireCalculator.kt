package exercise6

import java.time.LocalDateTime

fun main(args: Array<String>) {
    print("What is your current age?")
    val age = readLine()

    print("At what age would you like to retire?")
    val retireAge = readLine()

    val currentYear = LocalDateTime.now().year
    val retireYear = currentYear + (Integer.parseInt(retireAge) - Integer.parseInt(age))
    println("You have $currentYear years left until you can retire.")
    println("It's $currentYear. so you can retire in $retireYear")
}