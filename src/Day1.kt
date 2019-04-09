/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
 */
fun main() {
    print(twoAdd(intArrayOf(10, 15, 3, 7), 13))
}

private fun twoAdd(list: IntArray, k: Int): Boolean {
    val hashmap = HashMap<Int, Int>()

    list.forEachIndexed{ index, int ->
        if (hashmap.containsKey(k - int)){
            return true
        }
        hashmap[int] = int
    }
    return false
}