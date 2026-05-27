class Solution1 {

    maxRotateFunction(nums: number[]): number {

        const n = nums.length;

        let totalSum = 0;
        let currentF = 0;

        // Calculate total sum and F(0)
        for (let i = 0; i < n; i++) {
            totalSum += nums[i];
            currentF += i * nums[i];
        }

        let maxValue = currentF;

        // Calculate remaining rotations
        for (let k = 1; k < n; k++) {
            currentF = currentF + totalSum - n * nums[n - k];
            maxValue = Math.max(maxValue, currentF);
        }

        return maxValue;
    }
}