package step2

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val year = nextInt()

    if(year%4 == 0 && (year%100 != 0 || year%400 == 0))
        println("1")
    else
        println("0")
}