// Returns true if any element in the array is over the limit
fun smallEnough(a: IntArray, limit: Int): Boolean {
    return a.find { it > limit } == null
}