/**
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
**/

fun toCamelCase(str:String):Any = str.split("-", "_").mapIndexed{ index, value ->
        if (index != 0) value.replaceFirstChar { it.uppercaseChar()} else value
}.joinToString("")

fun main() {
    println(toCamelCase("the-stealth-warrior"))
}

