package step4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val arr = Array<Int>(N) {i -> nextInt()}
    val V = nextInt()
    var count = 0
    for(i in 0..arr.size-1) {
        if(arr[i] == V)
            count++
    }

    println(count)
}