class NewYearAndHurry {
    fun solve(problemsCount: Int, timeToArrive: Int): Int {
        val timeLeft = TOTAL_TIME - timeToArrive
        var sum = 0
        for (i in 1..(problemsCount + 1)) {
            sum += i * TIME_TO_SOLVE
            if (timeLeft - sum < 0) return i - 1
        }
        return problemsCount
    }

    companion object {
        const val TIME_TO_SOLVE = 5
        const val TOTAL_TIME = 240
    }
}
