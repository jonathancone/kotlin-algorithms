/**
 * Given a sorted subarray bounded by the rightIndex, insert the supplied value in sorted ascending position.
 */
fun insert(array: IntArray, rightIndex: Int, value: Int): IntArray {

    // Painfully verbose in Kotlin
    var result: IntArray =
        intArrayOf(
            *array.sliceArray(0..rightIndex),
            0,
            *array.sliceArray(rightIndex + 1 until array.size)
        )

    // The slot we'll put the new value in.
    var valueIndex = rightIndex + 1

    (rightIndex downTo 0)
        .takeWhile {
            result[it] > value && it >= 0
        }
        .forEach {
            result[it + 1] = result[it]
            valueIndex = it
        }

    result[valueIndex] = value

    return result

}

fun insertionSort(array: IntArray): IntArray {

    var copy = intArrayOf(array[0])

    for (i in 1 until array.size) {
        copy = insert(copy, i - 1, array[i])
    }

    return copy;
}


val array = insert(intArrayOf(1, 4, 6, 7, 15, 25), 3, 5)
println(array.joinToString())

val array2 = insert(intArrayOf(1, 4, 6, 7, 15, 25), 5, -7)
println(array2.joinToString())

val array3 = insert(intArrayOf(1, 4, 6, 7, 15, 25), 5, 26)
println(array3.joinToString())

val array4 = insertionSort(intArrayOf(4, 1, 7, 76, 15, 12, 5))
println(array4.joinToString())
