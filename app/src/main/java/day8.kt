import kotlin.io.*
import kotlin.collections.*

fun main(args: Array<String>) {
    val entries = readLine()!!.trim().toInt()
    val phoneBook = mutableMapOf<String, Int>()
    var i: Int = 0

    while(i < entries) {
        val inputLineList = readLine()!!.trim().split(" ")
        phoneBook.put(inputLineList[0], inputLineList[1].toInt())
        i++
    }

    while(true) {
        val query: String = readLine() ?: return
        query.trim()
        if(query in phoneBook) println("${query}=${phoneBook[query]}")
        else println("Not found")
    }
}
