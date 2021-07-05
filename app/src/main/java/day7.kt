import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    var i = 1

    while(i<=n) {
        print("${arr[n-i]} ")
        i++
    }
}
