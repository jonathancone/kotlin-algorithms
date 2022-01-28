package Passphrase


object Passphrase {
    /**
     *  Apply a trivial cipher to generate a passphrase.
     */
    fun passphrase(s: String, n: Int = 1): String {

        return s.mapIndexed { index, it ->
            if (it.isLetter()) {
                val x = it.plus(n)
                if (index % 2 == 0) x.uppercase() else x.lowercase()

            } else if (it.isDigit()) (9 - it.digitToInt()) else it
        }.joinToString("").reversed()

    }
}