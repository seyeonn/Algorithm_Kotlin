package step5

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val t = nextInt()
    for(i in 1..t) {
        val c = next()
        println(c[0].toString() + c[c.length-1].toString())
    }
}