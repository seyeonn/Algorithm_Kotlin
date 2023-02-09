package step2

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()

    if(x>0 && y>0)
        println("1")
    else if(x<0 && y>0)
        println("2")
    else if(x<0 && y<0)
        println("3")
    else if(x>0 && y<0)
        println("4")
}