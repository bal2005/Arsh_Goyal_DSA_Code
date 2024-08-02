class Solution {
    public boolean validPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;
        boolean res = true;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return (isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1));
            }
            l++;
            r--;
        }
        return res;
    }

    public boolean isPalindrome(String s, int l, int r) {

        boolean res = true;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                res = false;
                break;
            }
            l++;
            r--;
        }
        return res;
    }

}