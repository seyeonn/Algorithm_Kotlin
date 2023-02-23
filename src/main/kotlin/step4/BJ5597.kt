package step4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val arr = Array<Boolean>(31) {i -> false}
    for(i in 1..28) {
        arr[nextInt()] = true
    }
    for(i in 1..arr.size-1) {
        if(arr[i] == false)
            println(i)
    }
}