class Solution {
    public boolean isHappy(int n) {
        int num = n;
        int count=0;
        while (count < 10 && num != 1) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }

            num = sum;
            count++;
        }
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
}