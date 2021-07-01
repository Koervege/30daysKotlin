import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*
import kotlin.math.*

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    val tipFloat = tip_percent.toFloat()/100
    val taxFloat = tax_percent.toFloat()/100

    println( round(tipFloat*meal_cost + taxFloat*meal_cost + meal_cost).toInt() )
}

fun main(args: Array<String>) {
    val cost = readLine()!!.trim().toDouble()

    val tip = readLine()!!.trim().toInt()

    val tax = readLine()!!.trim().toInt()

    solve(cost, tip, tax)
}
