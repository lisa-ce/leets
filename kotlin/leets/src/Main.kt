fun main() {
    val nums = intArrayOf(4, 3, 2, 6)

    val n = nums.size
    var totalSum = 0
    var currentF = 0

    for (i in 0 until n) {
        totalSum += nums[i]
        currentF += i * nums[i]
    }

    var maxF = currentF

    for (i in 1 until n) {
        currentF = currentF + totalSum - n * nums[n - i]
        maxF = maxOf(maxF, currentF)
    }

    println(maxF)
}