class Solution {
    public boolean isPerfectSquare(int x) {
        if (x < 1) return false;  // handle edge case

        int left = 1, right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // avoid overflow in (left + right)

            long square = (long) mid * mid;  // avoid overflow
            if (square == x) {
                return true;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
