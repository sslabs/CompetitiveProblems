class KUniqueCharacters {
    fun solve(str: String): String {
        val charsCount = Character.getNumericValue(str.first())
        val sequence = str.substring(1)

        var longest = ""
        sequence.forEachIndexed { i, _ ->
                val subSequence = longestString(sequence.substring(i), charsCount, mutableListOf())
                if (longest.length < subSequence.length) {
                    longest = subSequence
                }
        }

        return longest
    }

    private fun longestString(str: String, rest: Int, map: MutableList<Char>): String {

        if (str.isEmpty()) return ""

        val firstChar = str[0]
        return if (!map.contains(firstChar)) {
            if (rest == 0) {
                ""
            } else {
                map.add(firstChar)
                firstChar.toString() + longestString(str.substring(1), rest - 1, map)
            }
        } else {
            firstChar.toString() + longestString(str.substring(1), rest, map)
        }
    }
}
