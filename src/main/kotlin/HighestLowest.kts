// Given a list of integers in a string, find the max and min values
fun highAndLow(numbers: String): String {

    val split = numbers.split(" ").map { it.toInt() }.asSequence();
    return "${split.maxOrNull()} ${split.minOrNull()}"
}
