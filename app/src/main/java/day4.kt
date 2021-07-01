
import kotlin.io.*


class Person(initialAge: Int) {

    var age: Int = -1

    init {
        if(initialAge >= 0) {
            age = initialAge
        } else {
            println("Age is not valid. setting age to 0.")
        }
    }

    fun amIOld() {
        when {
            age < 13        -> println("You are young.")
            age in 13..17   -> println("You are a teenager.")
            else            -> println("You are old.")
        }
    }

    fun yearPasses() {
        age++
    }

}


fun main(args: Array<String>) {
    val ich = Person(readLine()!!.trim().toInt())
    ich.amIOld()
    ich.yearPasses()
    ich.amIOld()
}