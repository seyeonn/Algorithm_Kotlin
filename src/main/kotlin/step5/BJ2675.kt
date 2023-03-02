package step5

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val t = nextInt()

    for(i in 1 .. t) {
        val r = nextInt()
        val s = next().toCharArray()

        for (j in 0..s.size-1) {
            for (k in 1 .. r) {
                print(s[j])
            }
        }
        println()
    }
}