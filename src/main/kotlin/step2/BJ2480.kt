package step2

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val A = nextInt()
    val B = nextInt()
    val C = nextInt()

    var money = 0
    if(A == B && B == C && C == A)
        println(10000 + A*1000)
    else if( A == B || A == C)
        println(1000 + A*100)
    else if(B == C)
        println(1000 + B*100)
    else
        println(Math.max(A, Math.max(B,C))*100)
}

