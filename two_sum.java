class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                if (map.get(temp) != i) {
                    return new int[] { i, map.get(temp) };
                }
            }
        }
        return new int[] {};

    }
}