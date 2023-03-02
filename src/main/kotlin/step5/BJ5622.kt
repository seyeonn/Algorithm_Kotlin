package step5

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val arr = next().toCharArray()
    var sum = 0

    for(i in 0 until arr.size) {
        sum += dial(arr[i]) + 1
    }
    println(sum)
}

fun dial(c: Char): Int {
    return when(c) {
        'A', 'B', 'C' -> 2
        'D', 'E', 'F' -> 3
        'G', 'H', 'I' -> 4
        'J', 'K', 'L' -> 5
        'M', 'N', 'O' -> 6
        'P', 'Q', 'R', 'S' -> 7
        'T', 'U', 'V' -> 8
        'W', 'X', 'Y', 'Z' -> 9
        else -> -1
    }
}