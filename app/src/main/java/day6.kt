import kotlin.io.*
import kotlin.collections.*

fun main(args: Array<String>) {
    val cases = readLine()!!.trim().toInt()
    var i = 0

    fun stringMixer(s: String) {
        val evens: MutableList<Char> = mutableListOf()
        val odds: MutableList<Char> = mutableListOf()
        var j = 0

        while(j<s.length) {
            when {
                j%2 == 0 -> evens.add(s[j])
                else     -> odds.add(s[j])
            }
            j++
        }
        println("${evens.joinToString("")} ${odds.joinToString("")}")
    }

    while(i<cases) {
        i++
        stringMixer(readLine()!!.trim())
    }
}
