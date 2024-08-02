class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        List<String> output = new ArrayList<>();
        back(n, 0, 0, output, res);
        return res;
    }

    public void back(int n, int left, int right, List<String> output, List<String> res) {
        if (left == n && right == n) {
            String s = String.join("", output);
            res.add(s);
        }
        if (left < n) {
            output.add("(");
            back(n, left + 1, right, output, res);
            output.remove(output.size() - 1);
        }
        if (right < left) {
            output.add(")");
            back(n, left, right + 1, output, res);
            output.remove(output.size() - 1);
        }
    }
}