import java.util.Scanner
import kotlin.io.*

val scanner = Scanner(System.`in`)
val n = scanner.nextInt()

//функция расчета числа фибоначчи
fun fibonacci(n: Int): Int {
    return if (n <= 0) {
        0
    } else if (n == 1) {
        1
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}

//функция расчета суммы чисел фибоначчи
fun sumOfFibonacci(n: Int): Int {
    return fibonacci(n + 2) - 1
}


fun main() {
    println(sumOfFibonacci(n)) //O(2^n)
}
