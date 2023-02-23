package step4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val arr = Array<Double>(N) {i -> nextDouble()}
    var max = arr[0]
    var sum = 0.0
    for(i in 1..arr.size-1) {
        if(arr[i] > max)
            max = arr[i]
    }
    for(i in 0..arr.size-1) {
        arr[i] = (arr[i]/max)*100
        sum += arr[i]
    }
    println((sum/N).toDouble())
}