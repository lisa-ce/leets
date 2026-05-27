def maxRotateFunction(self, nums):

    n = len(nums)

    total_sum = sum(nums)

    current_f = 0

    # Calculate F(0)
    for i in range(n):
        current_f += i * nums[i]

    max_value = current_f

    # Calculate other rotations
    for k in range(1, n):
        current_f = current_f + total_sum - n * nums[n - k]
        max_value = max(max_value, current_f)

    return max_value


print('hello lisa')