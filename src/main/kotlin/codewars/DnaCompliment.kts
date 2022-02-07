fun makeCompliment(dna: String): String = dna.map {
    when (it) {
        'A' -> 'T'
        'T' -> 'A'
        'G' -> 'C'
        'C' -> 'G'
        else -> ' '
    }
}.joinToString("")
