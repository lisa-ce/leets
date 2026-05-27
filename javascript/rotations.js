class Solution {

    maxRotateFunction(nums) {

        const n = nums.length;

        let totalSum = 0;
        let currentF = 0;

        // Calculate total sum and F(0)
        for (let i = 0; i < n; i++) {
            totalSum += nums[i];
            currentF += i * nums[i];
        }

        let maxF = currentF;

        // Calculate remaining rotations
        for (let i = 1; i < n; i++) {
            currentF = currentF + totalSum - n * nums[n - i];
            maxF = Math.max(maxF, currentF);
        }

        return maxF;
    }
}