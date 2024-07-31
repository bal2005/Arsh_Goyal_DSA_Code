class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();
        int max = 0;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            res.put(nums[i], res.getOrDefault(nums[i], 0) + 1);
        }
        for (int num : nums) {
            int temp = res.get(num);
            if (temp > max) {
                max = temp;
                r = num;
            }
        }
        return r;

    }
}