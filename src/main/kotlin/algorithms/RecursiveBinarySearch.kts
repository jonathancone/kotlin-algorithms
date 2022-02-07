val primes = intArrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)

/**
 * Perform a recursive binary search on a sorted array.
 *
 * @param a input array to search
 * @param value the value to search for
 *
 * @return the index of the value, or -1 if not found
 */
fun binarySearch(a: IntArray, value: Int): Int {
    return _binarySearch(a, value, 0, a.size - 1)
}

fun _binarySearch(a: IntArray, value: Int, min: Int, max: Int): Int {
    var midpoint = (min + max) / 2;

    println("Midpoint: ${midpoint}, Min: ${min}, Max: ${max}")

    if (a[midpoint] == value) return midpoint
    if (a[midpoint] > value) return _binarySearch(a, value, min, midpoint - 1)
    else if (a[midpoint] < value) return _binarySearch(a, value, midpoint + 1, max)

    return -1;
}


println(binarySearch(primes, 67))