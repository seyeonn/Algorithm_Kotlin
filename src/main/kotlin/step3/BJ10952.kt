package step3

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    while(true) {
        val A = nextInt()
        val B = nextInt()

        if(A == 0 && B == 0){
            break
        }
        println("${A+B}")
    }
}
