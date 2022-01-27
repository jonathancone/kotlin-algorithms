if (args.size != 1) println("usage: palindrome <string>")

val input = args.joinToString(" ")
println(if (input.reversed() == input) "1" else "0")