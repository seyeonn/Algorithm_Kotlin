package step3

fun main() {
    var n = readLine()!!.toInt()
    var num = n
    var count = 0

    do {
        n = (n%10)*10 + (((n/10) + (n%10))%10)
        count++
    } while(num != n)

    println(count)
}