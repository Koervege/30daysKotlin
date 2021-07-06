fun main(args: Array<String>) {
    val binary = Integer.toBinaryString(readLine()!!.trim().toInt())
    var current = 0
    var max = 0
    var index = 0

    while(index < binary.length) {
        if(binary[index] == '1') current++
        if(binary[index] == '0' || index == binary.length - 1) {
            if(current >= max) max = current
            current = 0
        }
        index++
    }
    println(max)
}
