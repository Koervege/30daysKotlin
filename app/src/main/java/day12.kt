
open class Human(
    val firstName: String,
    val lastName: String,
    val idNumber: Int,
) {
    fun printPerson() {
        println("Name: " + lastName + ", " + firstName
                + 	"\nID: " + idNumber)
    }
}

class Student(
    firstName: String,
    lastName: String,
    idNumber: Int,
    val scores: IntArray) :
    Human(firstName, lastName, idNumber) {

    fun calculate() : Char {
        return when((scores.reduce{ sum, element -> (sum + element)/scores.size})) {
            in 90..100 -> 'O'
            in 80 until 90 -> 'E'
            in 70 until 80 -> 'A'
            in 55 until 70 -> 'P'
            in 40 until 55 -> 'D'
            else -> 'T'
        }
    }

}

fun main() {
    val s = Student(readLine()!!, readLine()!!, readLine()!!.trim().toInt(), readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toIntArray())
    s.printPerson()
    println("Grade: ${s.calculate()}")
}