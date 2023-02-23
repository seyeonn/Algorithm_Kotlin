package step4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val arr = Array<Int>(N) {i -> nextInt()}
    var max = arr[0]
    var min = arr[0]

    for(i in 0..arr.size-1) {
        if(arr[i] < min)
            min = arr[i];
        if(arr[i] > max)
            max = arr[i];
    }
    println("$min $max")
}