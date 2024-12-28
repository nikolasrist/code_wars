/**
 * We need a function that can transform a number (integer) into a string.
 *
 * What ways of achieving this do you know?
 *
 * Examples (input --> output):
 * 123  --> "123"
 * 999  --> "999"
 * -100 --> "-100"
 */
fun numberToString(num: Int): String = num.toString()

/**
 * Given an array of integers your solution should find the smallest integer.
 *
 * For example:
 *
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
fun findSmallestInt(nums: List<Int>): Int = nums.minOf { it }

/**
 * Write a function that removes the spaces from the string, then return the resultant string.
 *
 * Examples (Input -> Output):
 *
 * "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
 * "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
 * "8aaaaa dddd r     " -> "8aaaaaddddr"
 */
fun noSpace(x: String): String = x.replace(" ", "")

/**
 * Given an array of integers, return a new array with each value doubled.
 *
 * For example:
 *
 * [1, 2, 3] --> [2, 4, 6]
 */
fun maps(x: IntArray): IntArray = x.map { it * 2 }.toIntArray()

/**
 * Implement a function which convert the given boolean value into its string representation.
 *
 * Note: Only valid inputs will be given.
 */
fun convert(b: Boolean): String = b.toString()

/**
 * You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.
 *
 * Write a program that returns the girl's age (0-9) as an integer.
 *
 * Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old". The first character in the string is always a number.
 */
fun getAge(yearsOld: String): Int = yearsOld[0].digitToInt()

/**
 * Rock Paper Scissors
 * Let's play! You have to return which player won! In case of a draw return Draw!.
 *
 * Examples(Input1, Input2 --> Output):
 *
 * "scissors", "paper" --> "Player 1 won!"
 * "scissors", "rock" --> "Player 2 won!"
 * "paper", "paper" --> "Draw!"
 */
fun rps(
    p1: String,
    p2: String,
): String {
    val player1 = "Player 1 won!"
    val player2 = "Player 2 won!"
    if (p1 == p2) return "Draw!"

    return when (p1) {
        "rock" -> {
            return when (p2) {
                "paper" -> player2
                "scissors" -> player1
                else -> ""
            }
        }
        "paper" -> {
            return when (p2) {
                "rock" -> player1
                "scissors" -> player2
                else -> ""
            }
        }
        "scissors" -> {
            return when (p2) {
                "rock" -> player2
                "paper" -> player1
                else -> ""
            }
        }
        else -> ""
    }
}

/**
 * You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
 * If it is a square, return its area. If it is a rectangle, return its perimeter.
 *
 * Example(Input1, Input2 --> Output):
 *
 * 6, 10 --> 32
 * 3, 3 --> 9
 * Note: for the purposes of this kata you will assume that it is a square if its length and width are equal, otherwise it is a rectangle.
 */
fun areaOrPerimeter(
    l: Int,
    w: Int,
): Int {
    val isSquare = l == w
    return if (isSquare) {
        l * w
    } else {
        l * 2 + w * 2
    }
}

/**
 * If you can't sleep, just count sheeps!!
 *
 * Task:
 * Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
 */
fun countingSheep(num: Int): String = arrayOfNulls<String>(num).mapIndexed { i, _ -> "${i + 1} sheep..." }.joinToString("")

fun main() {
    println(countingSheep(3))
}
