val primes = intArrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)

/**
 * Perform a stanard iterative binary search on a sorted array.
 *
 * @param a input array to search
 * @param value the value to search for
 *
 * @return the index of the value, or -1 if not found
 */
fun binarySearch(a: IntArray, value: Int): Int {
    var max = a.size - 1;
    var min = 0
    var midpoint = (min + max) / 2;
    var iterations = 0;

    while (a[midpoint] != value) {

        println("Midpoint: ${midpoint}, Min: ${min}, Max: ${max}, Iterations: ${iterations++}")

        if (a[midpoint] > value) max = midpoint - 1
        else if (a[midpoint] < value) min = midpoint + 1

        if (min > max) return -1

        midpoint = (min + max) / 2;
    }
    return midpoint;
}

println(binarySearch(primes, 61))