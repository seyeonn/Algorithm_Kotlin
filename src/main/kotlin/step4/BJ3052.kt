package step4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val arr = Array<Int>(42) {i -> 0}
    for(i in 0..9) {
        arr[nextInt()%42]++
    }

    var count = 0
    for(i in 0..arr.size-1){
        if(arr[i] != 0)
            count++
    }
    print(count)
}