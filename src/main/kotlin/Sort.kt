interface SortAlgorithms<T> {
    fun sort(arr: T)
}

class MergeSort : SortAlgorithms<IntArray> {

    /**
     * Method to do array merge sort of the passed
     * array of ints
     * @param arr the array to sort
     */
    override fun sort(arr: IntArray) {
        // check if there is only 1 element return
        if (arr.size == 1) {
            return
        }

        // otherwise create two new arrays
        val middleIndex = arr.size / 2

        val left = IntArray(middleIndex)
        left.forEachIndexed { index, _ ->
            left[index] = arr[index]
        }

        val right = IntArray(arr.size - left.size)
        right.forEachIndexed { index, _ ->
            right[index] = arr[middleIndex + index]
        }

        // do the recursive call with the new sorters
        sort(left)
        sort(right)

        // merge the resulting arrays
        merge(arr, left, right)
    }

    /**
     * Method to merge two sorted arrays
     * back into this object's array
     * @param inputArr the original array
     * @param left sorted left array
     * @param right the sorted right array
     */
    private fun merge(inputArr: IntArray, left: IntArray,
                      right: IntArray) {
        var leftIndex = 0 // current left index
        var rightIndex = 0 // current right index
        var i = 0 // current index in inputArr

        // merge the left and right arrays into inputArr
        while (leftIndex < left.size && rightIndex < right.size) {
            if (left[leftIndex] < right[rightIndex]) {
                inputArr[i] = left[leftIndex]
                leftIndex++
            } else {
                inputArr[i] = right[rightIndex]
                rightIndex++
            }
            i++
        }

        // copy any remaining in left
        for (j in leftIndex until left.size) {
            inputArr[i] = left[j]
            i++
        }

        // copy any remaining in right
        for (j in rightIndex until right.size) {
            inputArr[i] = right[j]
            i++
        }
    }
}

class QuickSort : SortAlgorithms<ArrayList<Int>> {

    override fun sort(arr: ArrayList<Int>) {
        quicksort(arr, 0, arr.size - 1)
    }

    // Take Left (first) Index of the array and Right (last) Index of the array
    fun quicksort(arr: ArrayList<Int>, left: Int, right: Int) {
        // If the first index less or equal than the last index
        if (left <= right) {
            // Create a Key/Pivot Element
            val key = arr[(left + right) / 2]

            // Create temp Variables to loop through array
            var i = left
            var j = right

            while (i <= j) {
                while (arr[i] < key)
                    i++
                while (arr[j] > key)
                    j--

                if (i <= j) {
                    arr.swap(i, j)
                    i++
                    j--
                }
            }

            // Recursion to the smaller partition in the array after sorted above
            if (left < j) {
                quicksort(arr, left, j)
            }
            if (right > i) {
                quicksort(arr, i, right)
            }
        }
    }
}

fun <T : Any> ArrayList<T>.swap(idx: Int, idy: Int) {
    val temp = this[idx]
    this[idx] = this[idy]
    this[idy] = temp
}