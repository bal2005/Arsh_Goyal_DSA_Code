class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.out.print(Arrays.toString(nums1));
        }
        if (n == 0) {
            System.out.print(Arrays.toString(nums2));
        }
        int ind = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[ind++];
        }

        for (int i = 0; i < m + n; i++) {
            for (int j = m + n - 1; j > 0; j--) {
                if (i > j)
                    break;
                if (nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(nums1));
    }
}