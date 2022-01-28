package race

/**
 * Given a velocity per hour, v1 with a head start g, how long will it take v2 to catch up to v1.
 */
fun race(v1: Int, v2: Int, g: Int): IntArray {
    // return [] if v1 >= v2
    if (v1 >= v2) return intArrayOf() else {

        val time = Math.floor(g / (v2 / 3600.0 - v1 / 3600.0)).toInt()

        val hours = Math.floor(time / 3600.0).toInt()
        val minutes = (time - (hours * 3600)) / 60
        val seconds = (time - (hours * 3600) - (minutes * 60))

        return intArrayOf(hours, minutes, seconds)

    }
}

