package step3

fun main() {
    val n = readLine()!!.toInt()

    for (line in 1..n) {
        for(space in 1..(n - line)) print(" ")
        for(star in 1..line) print("*")
        println()
    }
}