package step2

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val score = nextInt()

    when {
        score >= 90 -> println("A")
        score >= 80 -> println("B")
        score >= 70 -> println("C")
        score >= 60 -> println("D")
        else -> println("F")
    }
}