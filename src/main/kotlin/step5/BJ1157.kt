package step5

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val s = next().uppercase()
    val arr = Array<Int>(26) {_ -> 0 }

    var max = 0
    var result = '?'

    for(i in 0 until s.length) {
        val alp = s[i].code -65
        arr[alp]++

        if(max < arr[alp]) {
            max = arr[alp]
            result = s[i]
        } else if(max == arr[alp]) {
            result = '?'
        }
    }
    println(result)
}