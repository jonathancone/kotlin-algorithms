/**
 * Sort an IntArray in ascending order (in place).
 *
 * @param a the IntArray to sort
 */
fun selectionSort(a: IntArray): IntArray {
    if (a.size == 0) return a

    for (i in 0..a.size - 1) {
        for (j in i..a.size - 1) {

            if (a[i] > a[j]) {
                val temp = a[i]
                a[i] = a[j]
                a[j] = temp
            }
        }
    }
    return a
}

println(selectionSort(intArrayOf(300, 0, 7, 4, 1, 12, 22, -14)).joinToString(", "))