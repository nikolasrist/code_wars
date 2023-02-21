
fun printerError(s: String): String {
    val allowedLetters = ('a'..'m').toList()
    val errorCount = s.toList().count{ it !in allowedLetters }
    return "${errorCount}/${s.length}"
}