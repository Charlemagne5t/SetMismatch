public class Solution {
    public int[] findErrorNums(int[] nums) {

        int n = nums.length;
        int sum = n % 2 == 0 ? (1 + n) * (n / 2) : (1 + n) * (n / 2) + (n + 1) / 2;

        int[] res = new int[2];
        for (int i = 0; i < n; i++) {
            int cur = nums[i];
            if (cur < 0) {
                cur = -cur;
            }
            if (nums[cur - 1] < 0) {
                res[0] = cur;
            }
            sum -= cur;
            nums[cur - 1] = -nums[cur - 1];
        }
        res[1] = res[0] + sum;
        return res;
    }
}
