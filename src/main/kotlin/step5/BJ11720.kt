package step5

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val s: CharArray = next().toCharArray()
    var total = 0

    for(i in 0 until n) {
        total += s[i] - '0'
    }
    println(total)
}