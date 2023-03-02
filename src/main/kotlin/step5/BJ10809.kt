package step5

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val s = next()

    for(i in 'a' .. 'z') {
        print("${s.indexOf(i)} ")
    }
}