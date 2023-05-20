
fun main(args: Array<String>) {
    val n = 5
    if (n < 0) {
        throw IllegalArgumentException("Negative number")
    }

    var result = 1
    for (i in 2..n) {
        result *= i
    }

    println(result)
}
