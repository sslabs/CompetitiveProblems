class FindTheWord {
    fun solve(input: MutableList<String>): String {
        return when(input.size) {
            0 -> ""
            else -> {
                var word = input.removeAt(0).replace(">", "")
                while (input.size > 0) {
                    val nextIndex = findNextIndex(word[word.length - 1], input)
                    if (nextIndex >= 0) {
                        val next = input.removeAt(nextIndex)
                        word += next[2]
                        continue
                    }

                    val previousIndex = findPreviousIndex(word[0], input)
                    if (previousIndex >= 0) {
                        val previous = input.removeAt(previousIndex)
                        word = previous[0] + word
                        continue
                    }
                }
                return word
            }
        }
    }

    fun findNextIndex(c: Char, input: MutableList<String>): Int {
        input.forEachIndexed { i, s ->
            if (c == s[0]) return i
        }
        return -1
    }

    fun findPreviousIndex(c: Char, input: MutableList<String>): Int {
        input.forEachIndexed { i, s ->
            if (c == s[2]) return i
        }
        return -1
    }
}
