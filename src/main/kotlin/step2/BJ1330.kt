package step2

import java.util.*

fun main() = with(Scanner(System.`in`)){
    val a = nextInt()
    val b = nextInt()

    if(a > b) println(">")
    if(a < b) println("<")
    if(a == b) println("==")
}