class Solution {
    public int countGoodNumbers(long n) {
        int MOD = 1_000_000_007;
        int evenCount = 5;
        int oddCount = 4;

        long evenPos = (n + 1) / 2;
        long oddPos = n / 2;

        long res = power(evenCount, evenPos, MOD) * power(oddCount, oddPos, MOD);
        return (int)(res % MOD);
    }

    private long power(long base, long exp, int mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }
}
