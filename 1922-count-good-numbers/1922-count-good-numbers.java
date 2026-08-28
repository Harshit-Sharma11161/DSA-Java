class Solution {
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long k = power(5, even);
        long j = power(4, odd);
        long ans = (k * j) % 1000000007;
        return (int) ans;
    }
    public long power(long a, long b) {
        long ans = 1;
        long mod = 1000000007;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            b = b / 2;
        }
        return ans;
    }
}