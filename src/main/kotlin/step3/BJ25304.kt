package step3

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val x = nextInt()
    val n = nextInt()
    var sum = 0

    for(i in 1..n) {
        val a = nextInt()
        val b = nextInt()
        sum += (a*b)
    }

    if(sum == x)
        println("Yes")
    else
        println("No")
}