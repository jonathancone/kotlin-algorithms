fun findShort(s: String): Int = s.split(" ").minOf { it.length }
