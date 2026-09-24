class Solution {
    public static int sumOfADigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == sumOfADigits(nums[i])) {
                return i;
            }
        }
        return -1;
    }
}