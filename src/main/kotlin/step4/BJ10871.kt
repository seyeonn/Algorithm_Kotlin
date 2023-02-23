package step4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val X = nextInt()
    val arr = Array<Int>(N) {i -> nextInt()}
    for(i in 0..arr.size-1) {
        if(arr[i] < X)
            print("${arr[i]} ")
    }
}