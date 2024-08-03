class Solution {
    public int maxProduct(int[] nums) {
        double pre = 1, suf = 1;
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (pre == 0)
                pre = 1;
            if (suf == 0)
                suf = 1;
            pre = pre * nums[i];
            suf = suf * nums[nums.length - i - 1];
            max = Math.max(max, Math.max(pre, suf));
        }
        return (int) max;
    }
}