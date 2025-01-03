/**
 * https://www.codewars.com/kata/55cbc3586671f6aa070000fb/train/kotlin
 * This function should test if the factor is a factor of base.
 * Return true if it is a factor or false if it is not.
 */
fun checkForFactor(
    base: Int,
    factor: Int,
): Boolean = base % factor == 0

fun sum(mixed: List<Any>): Int = mixed.sumOf { it.toString().toInt() }

fun capitalize(text: String): List<String> {
    var evenString = ""
    var oddString = ""
    text.mapIndexed { i, c ->
        if (i == 0 || i % 2 == 0) {
            evenString += c.uppercase()
            oddString += c.lowercase()
        } else {
            evenString += c.lowercase()
            oddString += c.uppercase()
        }
    }
    return listOf(evenString, oddString)
}

fun angle(n: Int): Int = (n - 2) * 180

fun main() {
    println(capitalize("abcdef"))
}
