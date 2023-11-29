data class Node<T>(
    val element: T,
    var next: Node<T>? = null,
) {
    override fun toString(): String {
        val sb = StringBuilder()
        var node: Node<T>? = this
        while (node != null) {
            sb.append("(${node.element.toString()})->")
            node = node.next
        }
        sb.append("NULL")
        return sb.toString()
    }

    companion object {
        fun <T> build(collection: Collection<T>): Node<T>? {
            if (collection.isEmpty()) return null

            val head = Node(
                collection.first(),
            )

            var last: Node<T>? = head
            for (i in 1 until collection.size) {
                last?.next = Node(collection.elementAt(i))
                last = last?.next
            }
            return head
        }
    }
}

/*
 * Given pointers to the heads of two sorted linked lists, merge them into a single, sorted linked list.
 * Either head pointer may be null meaning that the corresponding list is empty.
 * HeadA = 1 -> 3 -> NULL
 * HeadB = 1 -> 2 -> NULL
 * Solution = 1 -> 1 -> 2 -> 3 -> 7 -> NULL
 *
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-merge-two-sorted-linked-lists
 */
class MergeTwoSortedLinkedLists {
    fun solve(head1: Node<Int>?, head2: Node<Int>?): Node<Int>? {
        return when {
            head1 == null && head2 == null -> null
            head1 == null -> head2
            head2 == null -> head1
            else -> {
                when {
                    head1.element < head2.element -> {
                        head1.next = solve(head1.next, head2)
                        head1
                    }
                    else -> {
                        head2.next = solve(head1, head2.next)
                        head2
                    }
                }
            }
        }
    }
}
