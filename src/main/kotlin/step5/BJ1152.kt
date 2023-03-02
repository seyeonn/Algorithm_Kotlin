package step5

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val s = nextLine()
    val st = StringTokenizer(s, " ")
    println(st.countTokens())
}