import kotlin.io.*
import kotlin.text.*

fun main(args: Array<String>) {
    val num = readLine()!!.trim().toInt()
    var i = 0
    while(i<10) {
        i++
        println("$num x $i = ${num*i}")
    }
}
