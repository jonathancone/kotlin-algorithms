/**
 * Determine if a given string is an anagram.
 */
if (args.size != 2) println("usage: anagram <string 1> <string 2>")
else println(if (sort(args[0]) == sort(args[1])) "1" else "0")

fun sort(string: String) = string.toCharArray().sorted().joinToString("")