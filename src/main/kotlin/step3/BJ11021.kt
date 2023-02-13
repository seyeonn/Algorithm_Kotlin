package step3

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val T = nextInt()

    for(i in 1..T) {
        val A = nextInt()
        val B = nextInt()

        println("Case #$i: ${A+B}")
    }
}
