class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n = s.length();

        for (int len = k; len <= n; len++) {

            String result = "";

            for (int start = 0; start <= n - len; start++) {

                // C++: s.substr(start, len)
                // Java equivalent:
                String temp = s.substring(start, start + len);

                int ones = 0;

                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) == '1') {
                        ones++;
                    }
                }

                if (ones == k) {

                    if (result.isEmpty() ||
                        temp.compareTo(result) < 0) {

                        result = temp;
                    }
                }
            }

            if (!result.isEmpty()) {
                return result;
            }
        }

        return "";
    }
}
