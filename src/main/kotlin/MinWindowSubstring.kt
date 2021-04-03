class MinWindowSubstring {
    fun solve(strArr: Array<String>): String {
        var min = strArr[0]
        strArr[0].forEachIndexed { i, _ ->
            val candidate = minSubstring(
                strArr[0].substring(i),
                strArr[1].associateBy({it}, {strArr[1].count { c -> c == it }}).toMutableMap()
            )
            if (candidate.second && candidate.first.length < min.length) min = candidate.first
        }
        return min
    }

    private fun minSubstring(n: String, map: MutableMap<Char, Int>): Pair<String, Boolean> {
        val seqIterator = n.toCharArray().iterator()
        var substring = ""
        while (seqIterator.hasNext() && map.filterValues { v -> v > 0 }.count() > 0 ) {
            val char = seqIterator.next()
            map.computeIfPresent(char) { _, v -> v - 1 }
            substring += char
        }
        return Pair(substring, map.filterValues { v -> v > 0 }.count() == 0)
    }
}
