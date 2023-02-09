package step2

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var h = nextInt()
    var m = nextInt() - 45
    if(m < 0) {
        m += 60
        --h
        if(h < 0)
            h += 24
    }

    println("$h $m")
}