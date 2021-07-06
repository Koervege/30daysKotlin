fun main(args: Array<String>) {
    val arr = Array<Array<Int>>(6) { Array<Int>(6) { 0 } }
    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    var currentSum: Int
    var maxSum = -300
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                    arr[i+1][j+1] +
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
            if(currentSum > maxSum) maxSum = currentSum
        }
    }
    println(maxSum)
}
