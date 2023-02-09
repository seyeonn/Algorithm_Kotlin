package step2

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val A = nextInt()
    val B = nextInt()
    val C = nextInt()

    val time = (A * 60) + B + C
    val hour = (time / 60) % 24
    val min = time % 60
    println("$hour $min")
}