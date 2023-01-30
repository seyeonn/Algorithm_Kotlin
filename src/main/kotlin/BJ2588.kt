import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val a = nextInt()
    val b = next()

    println(a * (b[2] - '0'))
    println(a * (b[1] - '0'))
    println(a * (b[0] - '0'))
    println(a * b.toInt())

}