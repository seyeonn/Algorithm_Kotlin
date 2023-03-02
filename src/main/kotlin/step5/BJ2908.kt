package step5

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt().toString().reversed()
    val b = nextInt().toString().reversed()

    if(a > b)
        println(a)
    else
        println(b)
}