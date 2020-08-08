import java.util.*
import kotlin.io.*
import kotlin.text.*

fun staircase(n: Int): Unit {
    for (i in 1..n) {
        val sb = StringBuilder()
        while (sb.length < n - i) {
            sb.append(' ')
        }
        while (sb.length < n) {
            sb.append('#')
        }
        println(sb.toString())
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
