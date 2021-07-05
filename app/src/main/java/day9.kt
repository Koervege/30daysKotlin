import kotlin.io.*
import kotlin.text.*

fun factorial(n: Int): Int {
    return if(n in 0..1) 1
    else n*factorial(n-1)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val result = factorial(n)
    println(result)
}
