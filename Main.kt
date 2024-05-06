import java.util.Scanner
import kotlin.io.*

val scanner = Scanner(System.`in`)
#переменная для определения до какого числа рассчитывать фибоначи
val n = scanner.nextInt()

fun fibonacci(n: Int): Int {
    return if (n <= 0) {
        0
    } else if (n == 1) {
        1
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}

fun sumOfFibonacci(n: Int): Int {
    return fibonacci(n + 2) - 1
}


fun main() {
    println(sumOfFibonacci(n)) //O(2^n)
}
