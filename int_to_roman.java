class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
        String res = "";
        int val[] = { 4000, 3000, 2000, 1000, 900, 800, 700, 600, 500, 400, 300, 200, 100, 90, 80, 70, 60, 50, 40, 30,
                20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int q = 0;
        int ctr = 0;
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(20, "XX");
        map.put(30, "XXX");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(60, "LX");
        map.put(70, "LXX");
        map.put(80, "LXXX");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(200, "CC");
        map.put(300, "CCC");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(600, "DC");
        map.put(700, "DCC");
        map.put(800, "DCCC");
        map.put(900, "CM");
        map.put(1000, "M");
        map.put(2000, "MM");
        map.put(3000, "MMM");
        map.put(4000, "MMMM");
        for (int i = 0; i < val.length; i++) {
            if (num >= val[i]) {
                q = num / val[i];
                String s = map.get(val[i]);
                res += s;
                num -= val[i];

            }

        }

        return res;
    }
}