class Solution {
    public int[] countBits(int n) {
        if (n == 0)
            return new int[] { 0 };
        if (n == 1)
            return new int[] { 0, 1 };
        int arr[] = new int[n + 1];
        String ba[] = new String[n + 1];
        int res[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i <= n; i++) {
            ba[i] = Integer.toBinaryString(arr[i]);
            int count = findOne(ba[i]);
            res[i] = count;
        }
        return res;

    }

    public static int findOne(String s) {
        int ct = 0;
        for (char c : s.toCharArray()) {
            if (c == '1')
                ct++;
        }
        return ct;
    }
}