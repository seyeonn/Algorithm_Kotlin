package step4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val M = nextInt()
    val arr = Array<Int>(N) {i -> 0 }

    for (t in 0 until M) {
        var i = nextInt() -1
        var j = nextInt() -1
        var k = nextInt()

        while(i <= j) {
            arr[i++] = k
        }
    }

    for (i in 0..arr.size-1){
        print("${arr[i]} ")
    }
}