class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int res = -1;
        if (haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (i + n < haystack.length() + 1) {
                if (haystack.substring(i, i + n).equals(needle)) {
                    res = i;
                    break;
                }
            }
        }
        return res;
    }
}