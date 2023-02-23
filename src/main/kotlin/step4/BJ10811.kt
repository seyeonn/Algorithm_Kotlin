package step4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val M = nextInt()
    val arr = Array<Int>(N) {i -> i+1 }

    for (t in 0 until M) {
        var i = nextInt() -1
        var j = nextInt() -1

        while(i < j) {
            val temp = arr[i]
            arr[i++] = arr[j]
            arr[j--] = temp
        }
    }

    for (i in 0..arr.size-1){
        print("${arr[i]} ")
    }
}