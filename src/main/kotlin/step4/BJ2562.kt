package step4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val arr = Array<Int>(9) {i -> nextInt()}
    var max = arr[0]
    var index = 0
    for(i in 0..arr.size-1) {
        if(arr[i] > max) {
            max = arr[i];
            index = i;
        }
    }
    println("$max\n${index+1}")
}